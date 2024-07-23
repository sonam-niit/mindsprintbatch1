import { useEffect, useState } from "react";

function Comments({ postId }) {
    const [comments, setComments] = useState([]);
    const fetchData = async () => {
        const resp = await fetch('https://jsonplaceholder.typicode.com/comments?postId=' + postId);
        const json = await resp.json();
        setComments(json);
    }
    useEffect(() => fetchData(), [])
    return (
        <>
            {
                comments.map(item => (
                    <div key={item.id}>
                        <h5>User:{item.name}</h5>
                        <p>Message:{item.body}</p>
                    </div>
                ))
            }
        </>
    );
}

export default Comments;