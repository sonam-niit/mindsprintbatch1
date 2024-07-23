import Child from "./Child";

function UserInfo({user}){
    return(
        <div className="p-2 m-2" style={{border:'2px solid grey'}}>
            <h3>Name:{user.name}</h3>
            <p>Address:{user.address}</p>
        </div>
    )
}

function Parent() {
    const obj={name:'test',address:'mumbai'};
    return ( 
        <div className="p-2" style={{border:'2px solid red'}}>
            <h1>This is My Parent Component</h1>
            <Child name="sonam" age="45" />
            <Child name="alex" age="12" />
            <Child name="catty" age="78" />
            <UserInfo user={obj} />
        </div>
     );
}

export default Parent;