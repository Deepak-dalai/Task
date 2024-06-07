import './App.css';
import {BrowserRouter,Routes,Route} from 'react-router-dom'
import Signin from './Signin';
import Registration from './Registration';


function App() {
  return (
    <BrowserRouter >
    <Routes>
      <Route path='/' element={<Signin/>}></Route>
      <Route path='/registration' element={<Registration/>}></Route> 
    </Routes>
    </BrowserRouter>
  );
}

export default App