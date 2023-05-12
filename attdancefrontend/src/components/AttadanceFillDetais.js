import React, { useEffect, useState } from 'react'

import axios from 'axios';
import { useNavigate } from 'react-router-dom';

import { v4 as uuidv4 } from 'uuid';

function AttadanceFillDetais() {

    const navigate = useNavigate()
    const [inputFileds, setInputFeilds] = useState([

        {
            id: uuidv4(),
            date: '',
            empName: '',
            projectName: '',
            numberHours: '',
            projectDecrtion: " "

        }


    ])

    const [allprojects, setAllProject] = useState([])

    //this hook get all list project 
    useEffect(() => {
        axios.get("http://localhost:8080/employee/getallproject").then(res => {
            console.log(res.data)
            setAllProject(res.data)
        })

    }, [])






    const handleChangeInput = (id, event) => {


        const newInputFields = inputFileds.map(i => {
            if (id === i.id) {
                i[event.target.name] = event.target.value
            }
            return i;
        })

        setInputFeilds(newInputFields);
        // console.log(event.trget.value)

        // const values=([...inputFileds]);

        // values[index][event.target.name]=event.target.value;
        // setInputFeilds.apply(values)


    }
    const handleRemoveFileds = (id) => {

        const values = [...inputFileds];
        values.splice(values.findIndex(value => value.id === id), 1);
        setInputFeilds(values);

        // const values =[...inputFileds]

        // values.splice(index,1)
        // setInputFeilds(values)



    }
    const handleAddFileds = (e) => {
        e.preventDefault();

        setInputFeilds([...inputFileds,
        {
            id: uuidv4(),
            date: '',
            empName: '',
            projectName: '',
            numberHours: '',
            projectDecrtion: ''
        }
        ])


    }
    const dataSentToBackent = (e) => {
        e.preventDefault();


        console.log("InputFilds", inputFileds)

        axios.post("http://localhost:8080/employee/allattandace", inputFileds).then(data => {
            console.log(data)
        })




    }
    const getAttdenceDetais = () => {

        navigate("/getAllAttedance")

    }

    return (
        <div style={{
            backgroundImage: "url(/formimage.jpg)",
            height: '100vh',
            marginTop: '0px',
            //  fontSize:'50px',
            backgroundSize: 'cover',
            backgroundRepeat: 'no-repeat',

        }}



        >

            <nav className="navbar navbar-expand-lg   navbar-dark bg-primary">
                <div className="container-fluid">
                    <a className="navbar-brand" href="/">Home</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div className="navbar-nav">
                            <a className="nav-link active   my-2 mr-sm-0" aria-current="page" href="">setting</a>
                           
                            
                           
                            {/* <a className="nav-link" href="#">admin</a>
                             */}
                        </div>
                    </div>
                </div>
            </nav>
            <center> <h1 className="text-primary">welcome to employee attendance portal</h1> </center>
            <button className='btn btn-primary' type='submit' onClick={handleAddFileds}>AddNewRow</button>
            <button className='btn btn-success' type='submit' onClick={getAttdenceDetais}>nextPage</button>
            <form >

                {
                    inputFileds.map(inputFiled => (

                        <div key={inputFiled.id} >
                            <label className="sr-only">Date</label>
                            <input type="date" name="date" value={inputFiled.date} onChange={event => handleChangeInput(inputFiled.id, event)} />
                            <label className="sr-only">EmployeeName</label>
                            <input type="text" name="empName" value={inputFiled.empName} onChange={event => handleChangeInput(inputFiled.id, event)} />

                            <label>ProjectName</label>
                            {/* <input type="text"  name="projectName"  value={inputFiled.projectName}  onChange={event =>handleChangeInput(inputFiled.id ,event)} /> */}



                            <select className="custom-select my-1 mr-sm-2" name="projectName" value={inputFiled.projectName} onChange={event => handleChangeInput(inputFiled.id, event)}>

                                {allprojects.map((projects) => (

                                    <option value={projects.projectName}>{projects.projectName}</option>

                                ))}

                            </select>





                            <label>NumberOfHoures</label>
                            <input type="text" name="numberHours" value={inputFiled.numberHours} onChange={event => handleChangeInput(inputFiled.id, event)} />
                            <label>ProjectDescription</label>
                            <input type="text" name="projectDecrtion" value={inputFiled.projectDecrtion} onChange={event => handleChangeInput(inputFiled.id, event)} />

                            <button type='submit' onClick={() => handleRemoveFileds(inputFiled.id)}>DeleteRow</button>

                        </div>


                    ))}
                <button className='btn btn-primary' type='submit' onClick={dataSentToBackent}>submit</button>
            </form>

        </div>

    )

}
export default AttadanceFillDetais

// onChange={event =>setInputFeilds([{date:event.target.value}])}
// onChange={event =>setInputFeilds([{empName:event.target.value}])}
// onChange={event =>setInputFeilds([{projectName:event.target.value}])}
// onChange={event =>setInputFeilds([{numberHours:event.target.value}])}
// onChange={event =>setInputFeilds([{projectDecrtion:event.target.value}])} 