package arrow.core.semigroup

import arrow.core.NonEmptyList
import arrow.core.nonEmptyListOf
import io.kotest.matchers.shouldBe

fun sumNel(nel: NonEmptyList<Int>): Int =
    nel.foldLeft(0) { acc, n -> acc + n }

fun main() {

    // head
    val value1 = nonEmptyListOf(1, 2, 3, 4, 5).head
    value1 shouldBe 1

    // foldLeft
    val value2 = sumNel(nonEmptyListOf(1, 2, 3))
    value2 shouldBe 6

    // map
    val value3 = nonEmptyListOf(1, 2).map { it + 1 }
    value3 shouldBe listOf(2, 3)

    // flatMap
    val nelOne: NonEmptyList<Int> = nonEmptyListOf(1)
    val nelTwo: NonEmptyList<Int> = nonEmptyListOf(4, 5)

    val value4 = nelOne.flatMap { one ->
        nelTwo.map { two ->
            one + two
        }
    }
    value4 shouldBe listOf(5, 6)

    // zip
    data class Person(val id: Int, val name: String, val age: Int)

    val ids = nonEmptyListOf(1, 2)
    val names = nonEmptyListOf("jiwon", "suhyun")
    val ages = nonEmptyListOf(10, 20)

    val value5 = ids.zip(names, ages) { id, name, age -> Person(id, name, age) }
    println(value5)
}
