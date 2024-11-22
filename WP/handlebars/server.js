const express = require("express");
const path= require("path");
const app = express();
const hbs = require("hbs");

const temPath=path.join(__dirname,"./views");

app.set("view engine", "hbs");
app.set("views", temPath);

app.get("/", (req,res) =>{
    res.render("index")
});

app.listen(8080, ()=>{
    console.log(__dirname)
    console.log(__filename)
    console.log("server is running at port!");
})
