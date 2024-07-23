import { useState } from "react";

function Counter() {
    const [count,setCount]=useState(0);
    const increment=()=>{
        setCount(count+1);
    }
    const decrement=()=>{
        if(count==0){
            alert('Count cannot be less than 0')
        }else{
            setCount(count-1);
        }
    }
    return ( 
        <div>
            <h2>Counter Demo: {count}</h2>
            <button onClick={increment}>+</button>
            <button onClick={decrement}>-</button>
        </div>
     );
}

export default Counter;