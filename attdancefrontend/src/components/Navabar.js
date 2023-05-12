import React from 'react'

function Navbar() {

    return (
         <div 
        
        style={{
            backgroundImage: "url(/formimage.jpg)" ,
            height:'100vh',
            marginTop:'0px',
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
                            <a className="nav-link active" aria-current="page" href="/login">login</a>
                            <a className="nav-link active" ria-current="page" href="/register">register</a>
                            <a className="nav-link active" ria-current="page" href="/getAllAttedance">getDetails</a>
                            <a className="nav-link active" ria-current="page" href="/employeeEnterAttedence">fillattedencedetails</a>
                            {/* <a className="nav-link" href="#">admin</a>
                             */}
                        </div>
                    </div>
                </div>
            </nav>



        </div>
    )
}
export default Navbar