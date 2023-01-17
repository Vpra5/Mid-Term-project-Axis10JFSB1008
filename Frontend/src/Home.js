import {Link} from 'react-router-dom';
import React, {useState} from 'react';
import'./App.css';

function Home(){
    
    return(
        <>
        <ul id="horizontal-list">
            <li> Home </li>
            <button><li><Link to="/flights">Flights</Link></li></button> 
            <button><li><Link to="/customers">Customers</Link></li></button>
            <button><li><Link to="/login"> Logout </Link></li></button>
        </ul>
        </>
    )
}
export default Home