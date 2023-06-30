import React from 'react';
import './userregister.css';
import { useNavigate } from 'react-router-dom';
export default function() {
  const navigate = useNavigate();
  return (
    <div>
            <h1 style={{textAlign:'center', marginTop:20, fontSize:40,color:'black'}}>Register</h1>
          <div style={{display:'flex',justifyContent:'center',alignItems:'center',height:450, marginTop:90}}>
          
            <div className="frame" style={{boxShadow: '0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)',width: 400,height:500, borderRadius:10,}}>
            <form action="">
              <div className="form-group" style={{marginLeft:40,marginRight:20}}>
                <br/><br/>

                <input type="text" className="form-control" placeholder="Enter Name" style={{width:300, height:40, borderRadius:10, borderColor:'b#e4e4e4lue', borderWidth:0}} /><br/><br/>

                <input type="text" className="form-control" placeholder="Enter Email" style={{width:300, height:40, borderRadius:10, borderColor:'#e4e4e4', borderWidth:0}} /><br/><br/>

                <input type="text" className="form-control" placeholder="Enter Qualification" style={{width:300, height:40, borderRadius:10, borderColor:'#e4e4e4',borderWidth:0}} /><br/><br/>

                <input type="text" className="form-control" placeholder="Technical Skills" style={{width:300, height:40, borderRadius:10, borderColor:'#e4e4e4',borderWidth:0}} /><br/><br/>
                
                <input type="text" className="form-control" placeholder="Experience" style={{width:300, height:40, borderRadius:10, borderColor:'#e4e4e4',borderWidth:0}} /><br/><br/>
                
                <input type="file" className="form-control" placeholder="Experience" style={{width:300, height:40, borderRadius:10, borderColor:'#e4e4e4', borderWidth:0}} /><br/><br/>
                
                  <div style={{flexDirection:'row', display:'flex'}}>
                      <div>
                           <p style={{color:'blue'}} onClick={()=>navigate("/")}>Already have an account?</p>
                      </div>
                      <div style={{marginLeft:30}}>
                           <input type="button" value="Register"  style={{backgroundColor:'blue', width:100, height:30, marginTop:10, borderRadius:5, borderColor:'#e4e4e4',borderWidth:0, color:'white' }}/>
                      </div>
                  </div>
                               
              </div>
            </form>

              
            </div>
          </div>  
    </div>


  )
}
