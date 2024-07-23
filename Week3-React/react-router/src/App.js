import { BrowserRouter as Router, Link, Route, Routes, Navigate,  } from "react-router-dom";
import Dashboard from "./Components/dashboard";
import UserList from "./Components/UserList";
import Details from "./Components/Details";
import NotFound from "./Components/404";
import GetAxios from "./Components/getaxios";

function ProtectedRoute({isAuthenticated,children}){
  return (isAuthenticated?children:<Navigate to='/login' />);
}
function Login(){
  return (<h1>Login Component</h1>)
}
function Home(){
  return (<h1>Home Component</h1>)
}
function About(){
  return (<h1>About Component</h1>)
}
function Contact(){
  return (<h1>Contact Component</h1>)
}
function News(){
  return (<h1>News Component</h1>)
}
function App() {
  const isAuthenticated=true;
  return (
    <Router>
      <GetAxios />
      <div>
          <Link to='home'>Home</Link> |
          <Link to='about'>About Us</Link> |
          <Link to='contact'>Contact Us</Link> |
          <Link to='news'>News</Link> |
          <Link to='dashboard'>Dashboard</Link> |
          <Link to='userlist'>User's List</Link> |
      </div>
      <Routes>
        <Route path="home" element={<Home />} />
        <Route path="about" element={<About />} />
        <Route path="contact" element={<Contact />} />
        <Route path="news" element={<News />} />
        {/* <Route path="dashboard/*" element={<Dashboard />} /> */}
        <Route path="dashboard/*" element={
          <ProtectedRoute isAuthenticated={isAuthenticated}>
            <Dashboard />
          </ProtectedRoute>
        }></Route>
        <Route path="userlist" element={<UserList />} />
        <Route path="details/:id" element={<Details />} />
        <Route path="login" element={<Login />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </Router>
  );
}

export default App;
