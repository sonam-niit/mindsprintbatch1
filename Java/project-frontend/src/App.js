import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import Register from './components/Register';
import { ToastContainer } from 'react-toastify';
import Login from './components/Login';

function App() {
  return (
    <BrowserRouter>
      <div className="App">
          <ul className='nav'>
              <li className='nav-item'>
                <Link to='register' className='nav-link'>Sign Up</Link>
              </li>
              <li className='nav-item'>
                <Link to='login' className='nav-link'>Sign In</Link>
              </li>
          </ul>
          <ToastContainer />
      </div>
      <Routes>
        <Route path='register' element={<Register />}/>
        <Route path='login' element={<Login />}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
