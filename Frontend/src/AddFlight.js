import { Link } from 'react-router-dom';
import { useState } from 'react';
import './App.css'

function AddFlight(){
    const [fid,setid] = useState('');
    const [fflightnumber,setflightnumber] = useState('');
    const [foperatingairlines,setoperatingairlines] = useState('');
    const [fdeparturecity,setdeparturecity] = useState('');
    const [farrivalcity,setarrivalcity] = useState('');
    const [fseats,setseats] = useState('');
    const [fflightprice,setflightprice] = useState('');
    
    const addFlight = () =>{
    let data = {
        id: fid,
        flightnumber: fflightnumber,
        operatingairlines: foperatingairlines,
        departurecity: fdeparturecity,
        arrivalcity: farrivalcity,
        seats: fseats,
        flightprice:fflightprice
   }
    fetch(`http://localhost:8092/api/flight/addFlight`,{
    method:"POST",
    body: JSON.stringify(data),
    headers : {
        "Content-Type":"application/json",
        "Access-Control-Allow-Origin":"*"
    }
   }).then(response => response.json())
     .then(json => console.log(json));
     alert("Flight Added Successfully !!! ")
    }


    //const AddFlight =() => {
    return(
        <div id="signup-div">
            <h1> Add Flight </h1>
            Flight Id <input type="text" onChange={ (e) => setid(e.target.value)} required/> <br/><br/>
            Flight FlightNumber: <input type="text" onChange={ (e) => setflightnumber(e.target.value)}/> <br/><br/>
            Flight OperatingAirlines: <input type="text" onChange={ (e) => setoperatingairlines(e.target.value)}/> <br/><br/>
            Flight DepartureCity: <input type="text" onChange={ (e) => setdeparturecity(e.target.value)}/> <br/><br/>
            Flight ArrivalCity: <input type="text" onChange={ (e) => setarrivalcity(e.target.value)}/> <br/><br/>
            Flight Seats: <input type="text" onChange={ (e) => setseats(e.target.value)}/> <br/><br/>
            Flight FlightPrice: <input type="text" onChange={ (e) => setflightprice(e.target.value)}/> <br/><br/>
            <button onClick={addFlight}> ADD FLIGHT</button><br/><br/>
            <Link to="/flights"> Flights </Link>
        </div>
    )
    }

export default AddFlight