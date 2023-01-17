import { useEffect, React, useState } from 'react';
import {Link} from 'react-router-dom';
import axios from 'axios';
import './App.css'

function Flights(){
    const [flights,setFlights] = useState([]);
    const url = `http://localhost:8092/api/flight/getAllFlights`;
    
    const deleteflight= (id) =>{
      const url =`http://localhost:8092/api/flight/flight/${id}`;
      axios.delete(url).then(() =>{
        alert('Flight is deleted')
        axios.get(`http://localhost:8092/api/flight`).then( res => { setFlights(res.data)})
      }).catch(_error=>{
        alert("Customer Not Found");
      })
    }

    const searchById = (id) =>{
      const url = `http://localhost:8092/api/flight/get_flight/${id}`;
      axios.get(url).then(res => {

          setFlights(res.data);
          console.log(res.data);

      })
  }
  
  const [searchid,setSearchid] = useState([]);
    


    
    useEffect ( () =>{
      axios.get(url).then( res => {
        //console.log(res.data);
        setFlights(res.data);
      })
    }, []);

    return(
      <div className="flight-list">
        <h1> FlightsList</h1>
        <input type="" className='search-flight-box' placeholder='Search Flight'
            onChange={(e) => setSearchid(e.target.value)}
             />
             <button onClick={() => searchById(searchid)}>Search</button>
        
        <ul>
            
              <li> id </li>
              <li> flightnumber </li>
              <li> operatingairlines</li>
              <li> departurecity</li>
              <li> arrivalcity</li>
              <li> seats</li>
              <li> flightprice</li>
              <li> Update </li>
              <li> Delete</li>
            </ul>
            {flights.length>0 ? flights.map (f => 
                            <ul key={f.id}>
                            <li>{f.id}</li>
                            <li>{f.flightnumber}</li>
                            <li>{f.operatingairlines}</li>
                            <li>{f.departurecity}</li>
                            <li>{f.arrivalcity}</li>
                            <li>{f.seats}</li>
                            <li>{f.flightprice}</li>
                            <li ><button><Link to={"/update"}>Update</Link></button></li>
                            <li><button onClick={()=>deleteflight(f.id)}> Delete</button></li>
                            </ul>
                            ): <h2 >No Result Found</h2>
                          }
                            <button><Link id="link" to="/home"> Home </Link><br/></button>
                            <button><Link id="link" to="/add">  AddFlight </Link></button>
        
        </div>
    )
}
export default Flights