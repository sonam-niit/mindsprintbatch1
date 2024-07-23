import { useEffect, useState } from "react";

function FetchData() {

    const [data,setData]=useState(null);
    const getData=async()=>{
        try {
            const resp= await fetch('https://jsonplaceholder.typicode.com/posts/1');
            const json=await resp.json();
            setData(json);
        } catch (error) {
            console.log(error);
        }
    }
    useEffect(()=>{getData()},[])
    return ( <div>
        {data? <h3>{data.title}</h3> :<p>Loading</p>}
    </div> );
}

export default FetchData;