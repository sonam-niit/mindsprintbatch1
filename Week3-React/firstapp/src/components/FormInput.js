import { useState } from "react";

function FormInput() {
    const [input,setInput]=useState('');
    const [age,setAge]=useState(18);
    const handleChange=(e)=>{
        setInput(e.target.value);
    }
    const handleSubmit=(e)=>{
        e.preventDefault();
        alert('Welcome '+input+" "+age)
    }
    return ( 
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder="Enter Your Name"
            onChange={handleChange} />
            <input type="text" placeholder="Enter Your Age"
            onChange={(e)=>setAge(e.target.value)} value={age}/>
            {/* <h1>Welcome {input}</h1> */}
            <button type="submit">SaveData</button>
        </form>
     );
}

export default FormInput;