import React from 'react'
import { useState } from 'react';
import axios from 'axios';
function Login() {
    const [empEmail, setempEmail] = useState();

    const [empPassWord, setempPassWord] = useState();


    const submitData=()=>{

        axios.get("http://localhost:8080/employee/allattandace/empEmail/empPassWord")

    }

    return (
        <div style={{
            backgroundImage: "url(/formimage.jpg)" ,
            height:'100vh',
            marginTop:'0px',
           //  fontSize:'50px',
            backgroundSize: 'cover',
            backgroundRepeat: 'no-repeat',
            
            }}>
            <form>
                <center>
                    <h1 className='text-primary'> login form</h1>
                <div className="form-row ">
                    <div className="form-group col-md-6">
                        <label >Enter Email</label>


                        <input type="email" className="form-control" name="empEmail" placeholder="Email" onChange={e => { setempEmail(e.target.value) }} />
                    </div>
                    <div className="form-group col-md-6">
                        <label >Enter PassWord</label>

                        <input type="password" className="form-control" name="empPassWord" placeholder="password" onChange={e => { setempPassWord(e.target.value) }} />
                    </div>
                </div>
                <br/>
                <div>
                <button type="submit" className="btn btn-primary" onClick={submitData}>login</button>
                </div>
                </center>
            </form>
        </div>
    )
}

export default Login
