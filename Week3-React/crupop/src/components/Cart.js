import { useDispatch } from "react-redux";

function Cart() {
    const dispatch=useDispatch();
    const array=[{id:1,name:'pen'},{id:2,name:'pencil'},
        {id:3,name:'headphone'}];
    return ( 
        <div>
            {
                array.map(item=>(
                    <div key={item.id}>
                        <h3>{item.name}</h3>
                        <button onClick={()=>dispatch({type:'ADD_ITEM',payload:item})}>Add to Cart</button>
                    </div>
                ))
            }
        </div>
     );
}

export default Cart;