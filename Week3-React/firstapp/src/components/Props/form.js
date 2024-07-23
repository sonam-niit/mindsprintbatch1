import { useState } from "react";

function Form(props) {
    const {adddata}=props;
    const [input,setInput]=useState('');
    const handleClick=()=>{
        adddata({id:Date.now(),name:input});
    }
    return ( <div className="m-2 p-2" style={{border:'2px solid red'}}>
        <h3>Form Component</h3>
        <input type="text" onChange={(e)=>setInput(e.target.value)} />
        <button onClick={handleClick}>Add Data</button>
    </div> );
}

export default Form;