import { useContext } from "react";
import { CountContext } from "./CounterContext";

function TestContext() {

    const {count,updateCount} = useContext(CountContext);
    return ( 
        <div>
            <h3>Count {count}</h3>
            <button onClick={updateCount}>Update</button>
        </div>
     );
}

export default TestContext;