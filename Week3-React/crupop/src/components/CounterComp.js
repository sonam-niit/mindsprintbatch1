import { useDispatch, useSelector } from "react-redux";

function CounterComp() {
    //useSelector used to read data from global state
    const count= useSelector(state=>state.counter.count);
    const dispatch= useDispatch();
    const handleInc=()=>{
        dispatch({type:'INCREMENT'})
    }
    return ( 
        <div>
            <h3>Counter Component: {count}</h3>
            <button onClick={handleInc}>+</button>
            <button onClick={()=>dispatch({type:'DECREMENT'})}>-</button>
        </div>
     );
}

export default CounterComp;