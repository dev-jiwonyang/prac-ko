package functional.chapter2


data class User(val name: String, val age: Int)

fun main() {
    val user = User("jiwon", 24)
    val (name, _) = user
}