import './myStyle.css';
const myStyle = {
    'width': '200px',
    'height': '300px',
    'background-color': 'red'
}
function StyledComp() {
    const result=28;
    return (
        <>
            <div style={myStyle}>
                This is my Styled Div
            </div>
            <div className='container'></div>
            <div style={{backgroundColor:'green',textAlign:'center'}}>
                Test
            </div>
            <h1 style={{color: result>=35?'green':'red'}}>Result: {result}</h1>
        </>
    );
}

export default StyledComp;