package arrow

import arrow.core.*

fun main() {
    val f = Validated.lift(String::toUpperCase, Int::inc)
    val res1 = f("test".invalid())
    println(res1)
    val res2 = f(1.valid())
    println(res2)

    val result = "Hello".valid().void()
    println(result)

    Validated.Valid(12).tap { println("flower") }
    Validated.Invalid(12).tapInvalid { println("flower") }

    val validString: Validated<Int, String> = "Hello".valid()
    val chars: Validated<Int, CharSequence> = validString.widen()
    println(chars)

    Validated.Valid(5).andThen {
        println(it)
        Validated.Valid(10)
    }
}
