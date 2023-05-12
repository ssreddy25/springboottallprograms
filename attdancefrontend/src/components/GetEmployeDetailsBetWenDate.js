import React, { useRef, useState } from 'react'

import axios from 'axios';
import { useReactToPrint } from 'react-to-print';

function GetEmployeDetailsBetWenDate() {
    const useRefRefrence=useRef()
    const pdfDownloded=useReactToPrint({
        content :()=>useRefRefrence.current,
    })
    const[empname,setEmpName]=useState();
    const[startdate,setStartDate]=useState();
    const[enddate,setEndDate]=useState();

    const[attedenceDetails,setAttedenceDetails]=useState([]);

    const employeeattedenacedetails=(e)=>{
        e.preventDefault();
        axios.get(`http://localhost:8080/employee/getAttedance/${empname}/${startdate}/${enddate}`).then(res=>{
            console.log(res.data)
            setAttedenceDetails(res.data)
        })

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
           <center> <h1 className="text-primary">welcome to the manager page</h1> </center>

            <form>
                <h1 className="text-primary">get employee attendance detailas</h1>
                <hr/>
                <label >enter the employeeName</label>
                <input type="text" name="empname" value={empname} onChange={e => setEmpName(e.target.value)} />
                <label >seletct the start</label>
                <input type="date" name="startdate" value={startdate} onChange={e => setStartDate(e.target.value)} />

                <label >select end date</label>
                <input type="date" name="enddate" value={enddate} onChange={e => setEndDate(e.target.value)} />
               
                <button className='btn btn-primary' type='submit' onClick={employeeattedenacedetails}>getdata</button> 
            </form>
           
            <div ref={useRefRefrence}>
                <table className="table table-bordered">
                    <thead>
                    <tr className="table-warning">
                        
                        <td>empName</td>
                        <td>date</td>
                        <td> projectName</td>
                        <td>numberHours</td>
                        <td>projectDescription</td>
                        
        
                    </tr>
                    </thead>
                    <tbody>
                        {
                            attedenceDetails.map((empdata)=>(
                                

                                    <tr  key={empdata.attedanceId}  className="table-primary">
                                        <td>{empdata.empName}</td>
                                        
                                        <td>{empdata.date}</td>
                                        
                                        
                                        <td>{empdata.projectName}</td>
                                        
                                       
                                        <td>{empdata.numberHours}</td>
                                        
                                        <td>{empdata.projectDecrtion}</td>
                                        
                                    </tr>

                                

                            ))



                            
                        }
                    </tbody>

                 
                </table>
            
            </div>
            <button className='btn btn-primary' onClick={pdfDownloded}>printdata</button>
        </div>

        





    )


}
export default GetEmployeDetailsBetWenDate