const express = require('express');
const app = express(); 
const hbs = require("hbs");
const path = require("path");
const user = require('./routes/route')
const res = require('express/lib/response');
const mongoose = require('mongoose')

const bodyParser = require('body-parser')
var jsonParser = bodyParser.json();
const url ="mongodb://localhost:27017/storing"

mongoose.connect(url, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log("Database connected.....!"))
    .catch(err => console.log(err));
app.set('view engine','hbs');
const css_path = path.join(__dirname,'/public');
app.use(express.static(css_path));

hbs.registerPartials(__dirname+'/views', '{{footer}}')

app.use(bodyParser.urlencoded({
    extended: true
}));

//end





app.get("/",(req,res)=>{
    res.render('index'); 
})

app.get("/rooms",(req,res)=>{
    res.render('rooms'); 
})

app.get("/contact",(req,res)=>{
    res.render('contact'); 
})

app.get("/login",(req,res)=>{
    res.render('login'); 
})

app.get("/booking",(req,res)=>{
    res.render('booking'); 
})

app.get("/payment",(req,res)=>{
    res.render('payment'); 
})
app.use(express.json());
app.use('/',user);

app.listen("3000",()=> {
    console.log("server connected");
})






