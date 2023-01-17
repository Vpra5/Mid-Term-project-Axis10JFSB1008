import { useEffect, React, useState } from 'react';
import {Link} from 'react-router-dom';
import axios from 'axios';
import './App.css'

function Customers(){
    const [customers,setCustomers] = useState([]);
    const url = `http://localhost:8091/api/cust/getAllCustomers`;
    
    const deletecustomer= (id) =>{
      const url =`http://localhost:8091/api/cust/customer/${id}`;
      axios.delete(url).then(() =>{
        alert('Customer is deleted')
        axios.get(`http://localhost:8091/api/cust`).then( res => { setCustomers(res.data)})
      })
    }

    /*const searchById = (id) =>{
      const url = `http://localhost:8092/api/flight/get_flight/${id}`;
      axios.get(url).then(res => {

          setFlights(res.data);
          console.log(res.data);

      })
  }
  
  const [searchid,setSearchid] = useState([]);*/
    


    
    useEffect ( () =>{
      axios.get(url).then( res => {
        //console.log(res.data);
        setCustomers(res.data);
      })
    }, []);

    return(
      <div className="customer-list">
        <h1>Customers List</h1>
        
        <ul>
            
              <li> id </li>
              <li> name </li>
              <li> gender</li>
              <li> username</li>
              <li> password</li>
              <li> phoneno</li>
              <li> email</li>
              <li> country</li>
              <li> Update </li>
              <li> Delete</li>
            </ul>
            {customers.length>0 ? customers.map (c => 
                            <ul key={c.id}>
                            <li>{c.id}</li>
                            <li>{c.name}</li>
                            <li>{c.gender}</li>
                            <li>{c.username}</li>
                            <li>{c.password}</li>
                            <li>{c.phoneno}</li>
                            <li>{c.email}</li>
                            <li>{c.country}</li>
                            <li><Link to={"/update"}>Update</Link></li>
                            <li><button onClick={()=>deletecustomer(c.id)}> Delete</button></li>
                            </ul>
                            ): <h2 >No Result Found</h2>
                          }
                            <Link id="link" to="/home"> Home </Link><br/>
                            <Link id="link" to="/addCustomer">  AddCustomer </Link>
        
        </div>
    )
}
export default Customers