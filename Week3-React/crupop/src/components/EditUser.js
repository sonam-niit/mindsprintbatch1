import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function EditUser() {
    const {id}=useParams();
    const [user,setUser]=useState(null);
    const navigate= useNavigate();
    //get old details of user based on ID
    const fetchData=async()=>{
        const resp= await axios.get(`http://localhost:3000/users/${id}`);
        setUser(resp.data);
    }
    useEffect(()=>{
        fetchData();
    },[])
    const handleSubmit=async(e)=>{
        e.preventDefault();
        const resp=await axios.put(`http://localhost:3000/users/${id}`,user);
        if(resp.status==200){
            alert('User Updated successfully');
            navigate('/list');
        }else{
            alert('error while updating data')
        }
    }
    return ( 
        <div>
            <h3>Update Profile</h3>
            {
                user &&
                <form onSubmit={handleSubmit}>
                <input type="text" value={user.name} 
                onChange={(e)=>setUser({...user,name:e.target.value})} />
                <input type="email" value={user.email} 
                onChange={(e)=>setUser({...user,email:e.target.value})} />
                <button type="submit">Update Data</button>
            </form>
            }
            
        </div>
     );
}

export default EditUser;