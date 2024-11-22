var greeting:String?= null// top-level nullable variable. ? is used for nullable variables
const val name="Mani"
fun main(){
    println("my name is $name")
    when(greeting){ //when statement is just like switch statement in java!
        null-> println("Hi $name") //We directly use the valuesOfVariable-> in when statement in kotlin.instead of "case valueOfVariable:"
        else-> println("$greeting $name")//We use else keyword instead of default keyword in switch.
    }
    if (greeting != null){ //if statements
        println("$greeting $name")
    }
    else{
        println("Hi $name")
    }
    println(name::class.simpleName)
    val greetingToPrint1 = if(greeting != null) greeting else "Hi"
    println(greetingToPrint1) // As greetingToPrint is null it will print Hi

    val greetingToPrint2 = when(greeting){null->"Hi $name" else->"$greeting $name"}
    println(greetingToPrint2) // As greetingToPrint is null it will print Hi

    println(takeGreetings())
}

fun takeGreetings():String = "Hello Kotlin"//{
    //return "Hello Kotlin"
//}