import { useState } from "react";

function Register() {
    const [user,setUser]=useState({name:'',email:'',username:'',password:''});
    const [list,setList]=useState([]);
    const handleChange=(e)=>{
        const {name,value}=e.target;
        setUser({
            ...user,[name]:value
        })
    }   
    const handleSubmit=(e)=>{
        e.preventDefault();
        console.log(user);
        setList([...list,user]);
        e.target.reset();
    }
    const deleteData=(email)=>{
        setList(list.filter(item=>item.email!==email));
    }
    return ( 
        <div>
            <h3>Register Component</h3>
            <form onSubmit={handleSubmit}>
                <div className="form-group mt-3">
                    <label>Name</label>
                    <input type="text" placeholder="John Doe" name="name" className="form-control"
                    onChange={handleChange} />
                </div>
                <div className="form-group mt-3">
                    <label>Email</label>
                    <input type="email" placeholder="John.doe@gmail.com" name="email" 
                    className="form-control" onChange={handleChange}/>
                </div>
                <div className="form-group mt-3">
                    <label>UserName</label>
                    <input type="text" placeholder="JohnDoe" name="username" className="form-control"
                    onChange={handleChange} />
                </div>
                <div className="form-group mt-3">
                    <label>Password</label>
                    <input type="password" placeholder="********" name="password" 
                    className="form-control" onChange={handleChange} />
                </div>
                <button type="submit" className="btn btn-primary w-100 mt-3">Register</button>
            </form>
            <h3>Users List</h3>
            <table className="table table-bordered table-hover">
                <thead><tr><th>Name</th><th>Email</th><th>UserName</th><th>Password</th></tr></thead>
                <tbody>
                    {
                        list.map(user=>(
                            <tr key={user.email}>
                                <td>{user.name}</td>
                                <td>{user.email}</td>
                                <td>{user.username}</td>
                                <td>{user.password}</td>
                                <button onClick=
                                {()=>deleteData(user.email)}>
                                    X</button>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
     );
}

export default Register;