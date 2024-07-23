function Child(props) {
    // const name= props.name;
    // const age= props.age;
    const {name,age}=props;
    return ( 
        <div className="p-3 m-2" 
        style={{border:'2px solid green'}}>
            <h3>{name}:{age}</h3>
        </div>
     );
}

export default Child;