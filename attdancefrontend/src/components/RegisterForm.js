import React, { useState } from 'react'

import axios from 'axios';


function RegisterForm() {

    const [empFristName, setempFristName] = useState();

    const [empLastName, setempLastName] = useState();

    const [empEmail, setempEmail] = useState();

    const [empNewPassWord, setempNewPassWord] = useState();
    const [empConfirmPassWord, setempConfirmPassWord] = useState();

    const [empAddress, setempAddress] = useState();
    const [type, settype] = useState();

    let employees={
        "empFristName":empFristName,
        "empLastName":empLastName,
        "empEmail":empEmail,
        "empNewPassWord":empNewPassWord,
        "empConfirmPassWord":empConfirmPassWord,
        "empAddress":empAddress,
        "type":type

    }
    
    const submitData=()=>{

        axios.get("http://localhost:8080/employee/allattandace" ,employees)

    }
    
    return (
        <div style={{
             backgroundImage: "url(/pre-registration.png)" ,
             height:'100vh',
             marginTop:'0px',
            //  fontSize:'50px',
             backgroundSize: 'cover',
             backgroundRepeat: 'no-repeat',
             
             }}>




            <form>
                <center>
                    <h1 className="text-warning">EmployeeRegisterForm</h1>
                <div className="form-row ">
                    <div className="form-group col-md-6">
                        <label >FristName</label>
                        <input type="text" className="form-control"  placeholder="fristName" name="empFristName" onChange={e =>{setempFristName(e.target.value)}} />
                    </div>
                    <div className="form-group col-md-6">
                        <label >LastName</label>
                        <input type="text" className="form-control"  placeholder="lastname" name="empLastName" onChange={e =>{setempLastName(e.target.value)}} />
                    </div>
                </div>
                <div className="form-group col-md-6">
                    <label >enterEmail</label>
                  
         
                    <input type="email" className="form-control" name="empEmail" placeholder="Email" onChange={e =>{setempEmail(e.target.value)}}  />
                </div>
                <div className="form-group col-md-6">
                    <label >PassWord</label>
                   
                    <input type="password" className="form-control" name="empNewPassWord" placeholder="password" onChange={e =>{setempNewPassWord(e.target.value)}}  />
                </div>
                <div className="form-group col-md-6">
                    <label >conformPassword</label>
                    <input type="password" className="form-control" name="empConfirmPassWord" placeholder="conformpassword" onChange={e =>{setempConfirmPassWord(e.target.value)}}  />
                </div>
                <div className="form-row">
                    <div className="form-group col-md-6">
                        <label >Address</label>
                        <input type="text" className="form-control" name="empAddress" placeholder="enterCityName" onChange={e =>{setempAddress(e.target.value)}} />
                    </div>
                    <br/>
                    <div className="form-group col-md-6">
                        <label >select yourole</label>
                        <select  className="form-control" name="type" onChange={e =>{settype(e.target.value)}}>
                            <option value="">select your role</option>
                            <option value="employee">employee</option>
                            <option value="manager">manager</option>
                            <option value="admin">admin</option>
                        </select>
                    </div>
                    
                
                </div>
                <div>
                    <br/>
                <button type="submit" className="btn btn-primary" onClick={submitData}>Sign in</button>
                </div>
                </center>
            </form>

        </div>
    )
}

export default RegisterForm
