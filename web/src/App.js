import logo from './logo.svg';
import './App.css';
import UserRegister from './Components/UserRegister';
import Login from './Components/Login';
import Home from './Components/Home';
import { BrowserRouter, Routes, Route } from "react-router-dom";


function App() {
  document.body.style = 'background: #f2f2f2;';
  return (
    <div>
          
          
          <BrowserRouter>
          <Routes>
              <Route path="/" element={<Login />}/>
              <Route path="UserRegister" element={< UserRegister/>} />
              <Route path="Home" element={< Home/>} />
              
          </Routes>
  </BrowserRouter> 
        
          
    </div>
  );
}

export default App;
