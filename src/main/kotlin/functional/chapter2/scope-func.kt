package functional.chapter2


data class Person(var name: String)

fun addSuffix(person: Person?) = person?.let { it.name + " 님" } ?: "아무개님"

fun main() {
    val person = Person("jiwon")

    println(addSuffix(person))
}