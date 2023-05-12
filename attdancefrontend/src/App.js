
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import AttadanceFillDetais from './components/AttadanceFillDetais';
import GetEmployeDetailsBetWenDate from './components/GetEmployeDetailsBetWenDate';
import Login from './components/Login';
import Manager from './components/manager/Manager';
import Navbar from './components/Navabar';
import RegisterForm from './components/RegisterForm';

function App() {
  return (
    <div className="App">
      
      <BrowserRouter>
      {/* <AttadanceFillDetais/> */}
      
      <Routes>
      <Route path="/" element={<Navbar/>}/>
        <Route path="/getAllAttedance" element={<GetEmployeDetailsBetWenDate/>}/>
        <Route path="/employeeEnterAttedence" element={<AttadanceFillDetais/>}/>
        
        <Route path="/register" element={<RegisterForm/>}/>
        <Route path="/login" element={<Login/>}/>
       
        <Route path="/managerpage" element={<Manager/>}/>
        

        
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
