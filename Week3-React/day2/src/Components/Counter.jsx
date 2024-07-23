import { useEffect, useState } from "react";

function Counter() {
    const [count,setCount]=useState(0);
    const increment=()=>{
        setCount(count+1);
    }
    useEffect(()=>{
        console.log('updated',count);
    },[count])
    return ( 
        <div>
            <h3>Counter Component:{count}</h3>
            <button onClick={increment}>Increment</button>
        </div>
     );
}

export default Counter;