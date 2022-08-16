import kotlinx.coroutines.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.json.*
import kotlinx.serialization.encodeToString
import kotlin.system.measureTimeMillis


//fun main() = runBlocking<Unit> {
//    val time = measureTimeMillis {
//        val one = doOne()
//        val two = doTwo()
//        println("${one+ two}")
//    }
//
//    println(time)
//}
//
//suspend fun doOne(): Int {
//    Thread.sleep(1000L)
//    return 13
//}
//
//suspend fun doTwo(): Int {
//    Thread.sleep(1000L)
//    return 15
//}

//data class Person(val name: String, val age: Int)
class Person(val name: String, val age: Int)

fun isAdult(person: Person): Boolean {
    println("isAdult? ${person.age}")
    return person.age > 20
}

fun getFirstName(person: Person): String {
    println("getFirstName? ${person.name}")
    return person.name
}

fun main() {
    val list = listOf(
        Person("jiwon", 20), Person("suhyun", 19),
        Person("jiwoo", 22), Person("hyein", 25)
    )

//    val res = list.asSequence()
//        .filter(::isAdult)
//        .map(::getFirstName)
//        .first()
//    print(res)

    val jiwon = Person("jiwon", 20)
    val woni = Person("jiwon", 20)

    print(jiwon == woni)
    print(jiwon.equals(woni))
}

