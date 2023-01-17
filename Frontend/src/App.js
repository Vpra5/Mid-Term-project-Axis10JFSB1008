import Home from "./Home";
import Login from "./Login";
import SignUp from "./SignUp";
import Flights from "./Flights";

import {Routes, Route, BrowserRouter} from 'react-router-dom';
import AddFlight from "./AddFlight";
import UpdateFlight from "./UpdateFlight";
import Customers from "./Customers";
import AddCustomer from "./AddCustomer";
import './App.css';

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="" element={<Login/>}></Route>
          <Route path="/signup" element={<SignUp/>}></Route>
          <Route path="/login" element={<Login/>}></Route>
          <Route path="/home" element={<Home/>}></Route>
          <Route path="/flights" element={<Flights/>}></Route>
          <Route path="/add" element={<AddFlight/>}></Route>
          <Route path="/update" element={<UpdateFlight/>}></Route>
          <Route path="/customers" element={<Customers/>}></Route>
          <Route path="/addCustomer" element={<AddCustomer/>}></Route>


          </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;