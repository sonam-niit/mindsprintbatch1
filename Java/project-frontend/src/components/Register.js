import axios from "axios";
import { useState } from "react";
import { toast } from "react-toastify";

function Register() {
    const [student,setStudent]= useState({name:'',email:'',password:''})
    const handleSubmit=async (e)=>{
        e.preventDefault();
        console.log(student);
        const resp=await axios.post('http://localhost:8081/api/students',student);
        console.log(resp);
        if(resp.status == 201){
            toast.success("User Registered Successfully")
        }else{
            toast.error("Error While registration");
        }
    }
    return (
        <div className="container">
            <form onSubmit={handleSubmit}>
                <div className="mb-3">
                    <label for="name" className="form-label">name</label>
                    <input type="text" className="form-control" id="name" placeholder="name"
                    value={student.name} onChange={(e)=>setStudent({...student,name:e.target.value})}/>
                </div>
                <div className="mb-3">
                    <label for="email" className="form-label">name</label>
                    <input type="email" className="form-control" id="email" placeholder="name@example.com"
                    value={student.email} onChange={(e)=>setStudent({...student,email:e.target.value})}/>
                </div>
                <div className="mb-3">
                    <label for="password" className="form-label">Password</label>
                    <input type="password" className="form-control" id="password" placeholder="**********"
                    value={student.password} onChange={(e)=>setStudent({...student,password:e.target.value})}/>
                </div>
                <button className="btn btn-primary mt-3" type="submit">Register</button>
            </form>
        </div>
    );
}

export default Register;