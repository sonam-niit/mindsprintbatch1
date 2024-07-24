import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function ListUser() {
    const navigate= useNavigate();
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
    const editData=(id)=>{
        navigate(`/edit/${id}`);
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
                            <button onClick={()=>editData(item.id)}>edit</button>
                        </tr>
                    ))
                }
            </tbody>
        </table>
    </div> );
}

export default ListUser;