import { useState } from "react";

function TodoApp() {
    const [input,setInput]=useState('');
    const [list,setList]=useState([]);
    const handleSubmit=(e)=>{
        e.preventDefault();
        setList([...list,{id:Date.now(),
            task:input,completed:false}]);
        e.target.reset();
    }
    const statusUpdate=(id)=>{
        setList(
            list.map(item=>{
                if(item.id==id){
                    item.completed=!item.completed;
                }
                return item;
            })
        )
    }
    return ( 
        <div>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="Enter Task" 
                onChange={(e)=>setInput(e.target.value)}/>
                <button type="submit">Add Todo</button>
            </form>
            <h3>List</h3>
            <ul>
                {
                    list.map(item=>(
                        <li key={item.id} 
                        onClick={()=>statusUpdate(item.id)}
                        style={{textDecoration: item.completed?'line-through':'none'}}
                        >{item.task}</li>
                    ))
                }
            </ul>
        </div>
     );
}

export default TodoApp;