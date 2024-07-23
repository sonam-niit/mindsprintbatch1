import axios from "axios";
import { useEffect, useState } from "react";

function GetAxios() {
    const [user,setUser]=useState(null);
    const fetchData=async()=>{
        const resp=await axios.get('https://jsonplaceholder.typicode.com/users/1');
        setUser(resp.data); 
    }
    useEffect(()=>{
        fetchData();
    },[])
    return ( 
        <div>
           { user && <h4>{user.name}</h4>}
        </div>
     );
}

export default GetAxios;