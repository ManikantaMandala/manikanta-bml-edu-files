const mongoose = require("mongoose")

const UserSchema = mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    email : {
        type: String,
        required: true,
        unique:true
    },
    password : {
        type : String,
        required: true
    },
    phone : {
        type : String,
        required: true
    },
   
})
const User = mongoose.model('User',UserSchema)

exports.User = User;












