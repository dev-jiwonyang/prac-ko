package functional

fun String.printWithHello(): String {
    return "Hello, ${this}"
}

fun main(){
    val world = "World"
    println(world.printWithHello())

}