import { useEffect } from "react";

function Welcome() {
    useEffect(()=>{
        console.log('Component Mounted');

        return (()=>{
            console.log('Component will Unmount');
        })
    },[])
    return ( 
        <div>
            <h2>Welcome Component</h2>
        </div>
     );
}

export default Welcome;