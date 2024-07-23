import axios from "axios";
import { useEffect, useState } from "react";

function ListUser() {
    const [users,setUsers]=useState([]);
    const fetchData=async()=>{
        const resp=await axios.get('http://localhost:3000/users');
        setUsers(resp.data); 
    }
    useEffect(()=>{
        fetchData();
    },[])
    const deleteData=async(id)=>{
        const resp=await axios.delete('http://localhost:3000/users/'+id);
        alert('user deleted successfully');
        fetchData();
    }
    return ( <div>
        <table>
            <thead>
                <tr><th>Id</th><th>Name</th><th>Email</th></tr>
            </thead>
            <tbody>
                {
                    users.map(item=>(
                        <tr key={item.id}>
                            <td>{item.id}</td>
                            <td>{item.name}</td>
                            <td>{item.email}</td>
                            <button onClick={()=>deleteData(item.id)}>x</button>
                        </tr>
                    ))
                }
            </tbody>
        </table>
    </div> );
}

export default ListUser;