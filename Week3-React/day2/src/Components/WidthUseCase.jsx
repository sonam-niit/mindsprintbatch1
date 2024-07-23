import { useEffect, useState } from "react";

function WidthUseCase() {
    const [width,setWidth]= useState(window.innerWidth);

    useEffect(()=>{
        const handleResize=()=>setWidth(window.innerWidth);
        window.addEventListener('resize',handleResize);

        return (()=>{
            window.removeEventListener('resize',handleResize);
        })
    })
    return ( 
        <h1>Window Width: {width}</h1>
     );
}

export default WidthUseCase;