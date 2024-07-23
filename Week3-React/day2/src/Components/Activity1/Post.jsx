import { useEffect } from "react";
import { useState } from "react";
import Comments from "./Comments";

function Post() {
    const [post, setPost] = useState([]);
    const fetchData = async () => {
        const resp = await fetch('https://jsonplaceholder.typicode.com/posts');
        const json = await resp.json();
        setPost(json);
    }
    useEffect(() => {
        fetchData();
    }
        , [])
    return (
        <>
            {
                post.map(item => (
                    <div key={item.id}>
                        <h3>{item.title}</h3>
                        <p>{item.body}</p>
                        <Comments postId={item.id} />
                        <hr />
                    </div>
                ))
            }
        </>
    );
}

export default Post;