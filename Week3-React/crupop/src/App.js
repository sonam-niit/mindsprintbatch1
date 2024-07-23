import {BrowserRouter, Link, Route, Routes} from 'react-router-dom';
import ListUser from './components/ListUser';
import AddUser from './components/AddUser';

function App() {
  return (
    <BrowserRouter>
      <div>
        <Link to='list'>Show All Users</Link>
        <Link to='add'>Add New User</Link>
      </div>
      <Routes>
        <Route path='list' element={<ListUser />} />
        <Route path='add' element={<AddUser />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
