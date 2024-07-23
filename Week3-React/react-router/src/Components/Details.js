import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function Details() {
    const params = useParams();//read url parameters
    const navigate= useNavigate();//navigate programatically
    const id = params.id;
    const [user, setUser] = useState(null);
    const fetchData = async () => {
        const resp = await fetch('https://jsonplaceholder.typicode.com/users/' + id);
        const json = await resp.json();
        setUser(json);
    }
    const goBack=()=>{
        navigate('/userlist');
    }
    useEffect(() => {
        fetchData();
    }, [])
    return (
        <div>
            <h1>Details Component</h1>
            {user &&
                <p>
                    {user.id} <br />
                    {user.name} <br />
                    {user.email} <br />
                    {user.username} <br />
                    {user.website} <br />
                    {user.phone} <br />
                </p>
            }
            <button onClick={goBack}>back</button>
        </div>
    );
}

export default Details;