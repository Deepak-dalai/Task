const express= require("express");
const mysql= require("mysql");
const cors= require('cors');

const app=express();
app.use(cors());
app.use(express.json());

const db= mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"",
    database:"signup"
})
app.post('/registration',(req,res) =>{
    const sql="INSERT INTO login('name','email','password') VALUES (?)";
    const values=[
        req.body.name,
        req.body.email,
        req.body.password
    ]
    db.query(sql,[values],(err,data)=>{
        if(err){
            return res.json("Error");
        }
        return res.json(data);
    })
})

app.post('/signin',(req,res) =>{
    const sql="SELECT * FROM login WHERE 'email' =? AND 'password' =? ";
    // const values=[
    //     req.body.name,
    //     req.body.email,
    //     req.body.password
    // ]
    db.query(sql,[req.body.email,req.body.password ],(err,data)=> {
        if(err){
            return res.json("Error");
        }
        if(data.length > 0){
            return res.json("Sucess");
          }
          else{
            return res.json("Failed")
          }
        
    })
})


app.listen(8081, ()=> {

    console.log("listening");

})