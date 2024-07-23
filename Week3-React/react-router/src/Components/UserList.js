import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

function UserList() {
    const [users,setUsers]=useState([]);
    const fetchData=async()=>{
        const resp=await fetch('https://jsonplaceholder.typicode.com/users');
        const json=await resp.json();
        setUsers(json); 
    }
    useEffect(()=>{
        fetchData();
    },[])
    return ( <div>
        <table>
            <thead>
                <tr><th>Name</th><th>Email</th><th>UserName</th></tr>
            </thead>
            <tbody>
                {
                    users.map(item=>(
                        <tr key={item.id}>
                            <td><Link to={`/details/${item.id}`}>{item.name}</Link></td>
                            <td>{item.email}</td>
                            <td>{item.username}</td>
                        </tr>
                    ))
                }
            </tbody>
        </table>
    </div> );
}

export default UserList;