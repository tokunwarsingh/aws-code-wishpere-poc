import React from 'react';
import { useNavigate, Link} from 'react-router-dom';
export default function() {
  const navigate = useNavigate();
  return (
    <div>
            <h1 style={{textAlign:'center', marginTop:50, fontSize:40,color:'black'}}>Login</h1>
          <div style={{display:'flex',justifyContent:'center',alignItems:'center',height:450, marginTop:10}}>
          
            <div className="frame" style={{boxShadow: '0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)',width: 400,height:330, borderRadius:10,}}>
            <form action="">
              <div className="form-group" style={{marginLeft:40,marginRight:20}}>
                <br/><br/>

                <label>Email</label><br/>
                <input type="email" className="form-control" placeholder="Enter Email" style={{width:300, height:40, borderRadius:10,borderBottomColor:'black',borderBottomWidth:'1' , borderColor:'#e4e4e4', borderWidth:0}} /><br/><br/>

                <label>Password</label><br/>
                <input type="password" className="form-control" placeholder="Enter password" style={{width:300, height:40, borderRadius:10, borderColor:'#e4e4e4', borderWidth:0,}} /><br/><br/>

  
                
                
                  <div style={{flexDirection:'row', display:'flex', marginTop:30}}>
                      <div>
                        <p style={{color:'blue'}} onClick={() => navigate('UserRegister')}>Registered?</p>
                      </div>
                      <div style={{marginLeft:105}}>
                           <input type="button" value="Login"  style={{backgroundColor:'blue', width:100, height:30, marginTop:5, borderRadius:5, borderColor:'#e4e4e4',borderWidth:0, color:'white'}} onClick={()=>navigate('Home')}/>
                      </div>
                  </div>
                               
              </div>
            </form>

              
            </div>
          </div>  
    </div>


  )
}
