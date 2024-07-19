async function fetchData(){
    try {
        const resp= await fetch('https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY');
        const json= await resp.json();
        console.log(json);
    } catch (error) {
        console.log(error);
    }
}
fetchData()