import {BrowserRouter, Link, Route, Routes} from 'react-router-dom';
import ListUser from './components/ListUser';
import AddUser from './components/AddUser';
import EditUser from './components/EditUser';
import TestContext from './components/TestContext';
import CounterComp from './components/CounterComp';
import { useSelector } from 'react-redux';
import Cart from './components/Cart';

function App() {
  const cart= useSelector(state=>state.cart.items);
  return (
    <BrowserRouter>
      <div>
        <Link to='list'>Show All Users</Link>
        <Link to='add'>Add New User</Link>
        <Link to='test'>Check Context</Link>
        <Link to='redux'>Redux Demo</Link>
        <Link to='cart'>Cart Dmeo</Link>
        <h4>{cart.length} items in Cart</h4>
        <p>{JSON.stringify(cart)}</p>
      </div>
      <Routes>
        <Route path='list' element={<ListUser />} />
        <Route path='add' element={<AddUser />} />
        <Route path='edit/:id' element={<EditUser />} />
        <Route path='test' element={<TestContext />} />
        <Route path='redux' element={<CounterComp />} />
        <Route path='cart' element={<Cart />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
