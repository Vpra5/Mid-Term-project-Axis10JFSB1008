import { Link } from 'react-router-dom';
import { useState } from 'react';
import './App.css'

function AddCustomer(){
    const [cid,setid] = useState('');
    const [cname,setname] = useState('');
    const [cgender,setgender] = useState('');
    const [cusername,setusername] = useState('');
    const [cpassword,setpassword] = useState('');
    const [cphoneno,setphoneno] = useState('');
    const [cemail,setemail] = useState('');
    const [ccountry,setcountry] = useState('');
    
    const addCustomer = () =>{
    let data = {
        id: cid,
        name: cname,
        gender: cgender,
        username: cusername,
        password: cpassword,
        phoneno: cphoneno,
        email:cemail,
        country: ccountry
   }
    fetch(`http://localhost:8091/api/cust/addCustomer`,{
    method:"POST",
    body: JSON.stringify(data),
    headers : {
        "Content-Type":"application/json",
        "Access-Control-Allow-Origin":"*"
    }
   }).then(response => response.json())
     .then(json => console.log(json));
     alert("Customer Added Successfully !!! ")
    }


    //const AddCustomer =() => {
    return(
        <div id="signup-div">
            <h1> Add Customer </h1>
            Customer Id <input type="number" onChange={ (e) => setid(e.target.value)}/> <br/><br/>
            Customer Name: <input type="text" onChange={ (e) => setname(e.target.value)}/> <br/><br/>
            Customer Gender: <input type="text" onChange={ (e) => setgender(e.target.value)}/> <br/><br/>
            Customer UserName: <input type="text" onChange={ (e) => setusername(e.target.value)}/> <br/><br/>
            Customer Password: <input type="number" onChange={ (e) => setpassword(e.target.value)}/> <br/><br/>
            Customer Phoneno: <input type="number" onChange={ (e) => setphoneno(e.target.value)}/> <br/><br/>
            Customer Email: <input type="text" onChange={ (e) => setemail(e.target.value)}/> <br/><br/>
            Customer Country: <input type="text" onChange={ (e) => setcountry(e.target.value)}/> <br/><br/>
            <button onClick={addCustomer}> ADD CUSTOMER</button><br/><br/>
            <Link to="/home"> Home </Link>
        </div>
    )
    }

export default AddCustomer