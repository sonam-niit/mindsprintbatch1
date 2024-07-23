function Details({data}) {
    return ( 
        <div className="m-2 p-2" style={{border:'2px solid red'}}>
            <h3>Details Component</h3>
            <h3>{data.id}</h3>
            <h3>{data.name}</h3>
        </div>
     );
}

export default Details;