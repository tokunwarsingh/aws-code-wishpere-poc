import React from "react";

export default function Home() {
   const jobData= [
	{
		img:'https://mma.prnewswire.com/media/1022385/Persistent_Systems_Logo.jpg',
		jobHead : 'Project Lead (Persistent system)',
		requrement:'Require project lead with skellset of Java, Springboot',
		Location: 'Pune|Ahemdabad|Mumbai',
		salary:'90K - 100K',
		jobType:'Full Time'
	},
	{
		img:'https://boomi.com/wp-content/uploads/wipro-logo.jpg',
		jobHead : 'Senior Developer (Wipro)',
		requrement:'Require project lead with skellset of C#, .Net Core',
		Location: 'Pune|Indore|Mumbai',
	  salary:'70K - 80K',
		jobType:'Full Time'
	},
	{
		img:'https://tse2.mm.bing.net/th/id/OIP.Jm0Lorqlgol1reX8idvG8AHaE8?pid=ImgDet&rs=1',
		jobHead : 'QA Automation (Infosys)',
		requrement:'Require project lead with skellset of core Java, Seleniam',
		Location: 'Indore|Mumbai|Delhi',
		salary:'60K - 70K',
		jobType:'Full Time'
	},
  {
		img:'https://tse2.mm.bing.net/th/id/OIP.Jm0Lorqlgol1reX8idvG8AHaE8?pid=ImgDet&rs=1',
		jobHead : 'Software Engineer (Infosys)',
		requrement:'Require project lead with skellset of Python, Django',
		Location: 'Indore|Delhi',
		salary:'110K - 110K',
		jobType:'Full Time'
	}	
]

  return (
    <div>
      
      <br />
      
        <form action="">

        <div style={{flexDirection:'row',display:'flex', marginLeft:230}}>
          
          <div>
              <input
            type="text"
            className="form-control"
            placeholder="Search Job"
            style={{
              width: 700,
              height: 50,
              borderBottomColor: "black",
              borderBottomWidth: "1",
              borderColor: "#e4e4e4",
              borderWidth: 1,
              fontSize: 20,
            

            }}
          />
          </div>
            <button style={{color:'white',backgroundColor:'black',fontSize:20}}>Search</button>
          <div>
          </div>
        </div>
          
          <br />
        </form>
        <div
          style={{
            backgroundColor: "white",
            width: 1250,
            height: 'auto',
            marginTop: 70,
            paddingTop: 50,
            paddingBottom: 100,
           
          }}>

          {/**post block,  mapping - AWS tool*/}
          {
      jobData.map((item)=>{
        return(
          <div
            style={{
              flexDirection: "row",
              display: "flex",
              width: 1150,
              height: 260,
              backgroundColor: "white",
              marginBottom: 20,
              boxShadow:
                "0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)",
            }}>
            <div
              className="Image"
              style={{ width: 230, height: 230, margin: 10 }}>
              <img
                src= {item.img}
                alt=""
                style={{ width: 230, height: 230 }}
              />
            </div>
            <div
              className="Job-desc"
              style={{ width: 1030, height: 250, paddingLeft: 10 }}>
              
               {/**job title */}
              <div style={{display:'flex',flexDirection:'row'}}>
                <div style={{width:750}}><h2 style={{ textAlign: "left" }}>
                {item.jobHead}
              </h2></div>
                <div>
                    <button style={{borderRadius:7,width:100,height:40,marginTop:20,backgroundColor:'black',color:'white',fontSize:20, borderColor:'white'}}>Apply</button>
                </div>
              </div>

              
              <hr />

              {/** descriptiom */}
              <p style={{ textAlign: "left" }}>
                Description: {item.requrement}
              </p>
              {/**Location */}
              <p style={{ textAlign: "left" }}>
                Location: {item.Location}
              </p>
              <p style={{ textAlign: "left" }}>Salary: {item.salary}</p>
              <p style={{ textAlign: "left" }}>Job Type: {item.jobType}</p>
            </div>
          </div>)})
        }
        </div>
      
    </div>
  );
}
