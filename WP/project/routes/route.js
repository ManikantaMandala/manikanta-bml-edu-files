const {User} = require('../schema');
const express = require('express'); 
const router = express.Router();
router.post("/", async(req,res)=>{

   
    let createddata = new User({
        name:req.body.name,
        email:req.body.email,
        password:req.body.password,
        phone:req.body.phone
    })

      await createddata.save();

    console.log("USER REGISTERED");
    res.redirect("/rooms");
})
module.exports = router;