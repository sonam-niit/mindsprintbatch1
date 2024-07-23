function Loops() {
    const array = [{ id: 1, name: 'alice' }, { id: 2, name: 'bobby' }, { id: 3, name: 'catty' }];
    return (
        <>
            <table className="table table-bordered table-striped">
                <thead><tr><th>Id</th><th>Name</th></tr></thead>
                <tbody>
                    {
                        array.map(item => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.name}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </>
    );
}

export default Loops;