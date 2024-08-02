import axios from "axios";
import { useEffect, useState } from "react";

function ListCourses() {
    const [list,setList]=useState([]);
    const [selected,setSelected]=useState(null);
    const fetchData=async()=>{
        try {
            const resp= await axios.get('http://localhost:8081/api/courses');
            setList(resp.data);
        } catch (error) {
            console.log(error);
        }
    }
    const handleEdit=async(e)=>{
        e.preventDefault();
        const resp=await axios.put('http://localhost:8081/api/courses/'+selected.id,selected);
        if(resp.status==200){
            alert('course updated');
            fetchData();
            setSelected(null);
        }else{
            alert('Error while update')
        }
    }
    useEffect(()=>{
        fetchData();
    },[])
    return ( 
        <div>
            <h3>All courses</h3>
            <table>
                <thead><tr><th>Id</th><th>Name</th></tr></thead>
                <tbody>
                    {
                        list.map(item=>(
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.title}</td>
                                <td>
                                    <button onClick={()=>setSelected(item)}>Edit Course</button>
                                </td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
           {
            selected &&
            <form onSubmit={handleEdit}>
            <h3>Edit Course</h3>
            <input type="text" placeholder="Enter Course"
            value={selected.title} onChange={(e)=>setSelected({...selected,title:e.target.value})}/>
            <button type="submit">Save Data</button>
        </form>
           }
        </div>
     );
}

export default ListCourses;