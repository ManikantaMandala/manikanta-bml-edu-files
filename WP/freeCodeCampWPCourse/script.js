//All these are being an object of the html code!.
var dom = document.getElementById('helloworld')
// dom.innerHTML= 5+6;
// document.write(5+6)//Never call document.write after the document has finished loading.It will overwrite the whole document.
dom.style.color="red"
function myFunction(){
    document.write(5+6) //when this function is called the whole document will be overwritten and only 11 will be printed.
}
//document.write() method should only be used for testing.

function windowAlert(){
    // window.alert(5+6) // instead of printing 11 on the page we can give an alert to the window!(with window.alert(THING YOU WANT TO ALERT))
    alert(5+6)//this will also work!
    //In JS, window object is the global scope object, that means that variables, properties, and methods by default belong to the window object. This also means that specifying the window keyword is optional!
}

function consoleLog(){
    // for debugging purposes, you can call the console.log() method in browser to display data.
    console.log(5+6)
}

function printMethod(){
    print();
}
// js doesn't have any print object or print methods for printing outputs on the page or console etc..
// if you use print() method then it will ask for print the hardcopy of the page!(Ctrl+Shift+p)

// JavaScript Statements
//instructions -> statements!
//it compose of values, operators, Expressions, Keywords, and Comments!
// js is interpreter
// function dgbi(){
//     // var x = document.getElementById('ajk');
//     var y =document.getElementById('mani');
//     y.innerHTML += "<input>";
// }

//Declaring of variables:
// 1. using var(defines globally)(Declares a variable)
// 2. using let(defines in the scope of a block)(Declares a block variable)
// 3.using const(If you want a general rule:always declare variables with "const")(These can't be changed!)
// 4.using nothing

// POINTS TO BE REMEMBERED ABOUT var AND let:
//1. let doesn't allow to redeclare variables
//2. redeclaring a variable with var in a different scope or block changes the value of the outer variable too. but not with let!
//3. When a variable declared with var is used in a loop, the value of that variable changes!
//4. variables declared with var are hoisted to undefined(not an error) but variables declared with let are given error(variable is not defined)
//3.const(Declares a block constant)

// fixed values are called Literals
// -> single comment 
// /* */ -> multiple comment lines

// variableName is called as identifier of that variable.

// LET and VAR keyword:
// variables defined with let cannot be redeclared.
// variables defined with let must be declared before use.
// variables defined with let have Block scope.
{
  let x = 2
  // x can be used here.
}
// x can't be used here.
console.log(x)


var x =10
{
  var x=2
}
console.log(x)// x value is 2 not 10

// let x=10
{
  let x=2
}
console.log(x)//x value is 10 not 2

//const keyword:
//It does not define a constant value. It defines a constant reference to a value.
//Because of this you can NOT:
//1.Reassign a constant value.
//2.Reassign a constant array.
//3.Reassign a constant object.
//
//But you CAN:
//1.Change the elements of constant array.
//2.Change the properties of constant object.



