import { useEffect, useState } from "react"
import Counter from "./Components/Counter"
import Welcome from "./Components/Welcome";
import FetchData from "./Components/FetchData";
import WidthUseCase from "./Components/WidthUseCase";
import SubmissionTimer from "./Components/SubmissionTimer";
import Post from "./Components/Activity1/Post";


function App() {
  const [flag,setFlag]=useState(false);
  const [name,setName]=useState('');
  useEffect(()=>{
    console.log('Use Effect Triggered');
  })
  return (
    <div>
      <Post />
      {/* <h1>Hello World</h1>
      <Counter />
      <input type="text" onChange=
      {(e)=>setName(e.target.value)} />
      <h3>Welcome {name}</h3>
      <button onClick={()=>setFlag(!flag)}>
        {flag?'Hide':'Show'}</button>
      {flag && <Welcome />}
      <FetchData />
      <WidthUseCase />
      <SubmissionTimer submissionDate="2024-07-26T23:59:59" /> */}
    </div>
  )
}

export default App
