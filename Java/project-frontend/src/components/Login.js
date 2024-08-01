import axios from "axios";
import { useState } from "react";
import { toast } from "react-toastify";

function Login() {
    const [student,setStudent]= useState({name:'',email:'',password:''})
    const handleSubmit=async (e)=>{
        e.preventDefault();
        console.log(student);
        const resp=await axios.post('http://localhost:8081/api/students/login',student);
        console.log(resp);
        if(resp.status == 200){
            toast.success("User LoggedIn");
            localStorage.setItem('student',JSON.stringify({id:resp.data.id,
                name:resp.data.name,email:resp.data.email}));
                //redirect user to the dashboard page
            if(resp.data.role==1){
                //redirect to admin component
            }else{
                //redirect to user dashboard
            }
        }else{
            toast.error("Error While registration");
        }
    }
    return (
        <div className="container">
            <form onSubmit={handleSubmit}>
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

export default Login;