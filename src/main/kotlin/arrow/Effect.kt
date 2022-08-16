package arrow

import arrow.core.Either
// interface Effect<R, A>
// R -> shift type(에러)
// A -> success type(값)

//import arrow.core.continuations.effect
//import io.kotest.matchers.shouldBe
//
//suspend fun main() {
//    val shift = effect<String, Int> {
//        shift("Hello, World!")
//    }.fold({ str: String -> str }, { int -> int.toString() })
//    shift shouldBe "Hello, World!"
//
//    val res = effect<String, Int> {
//        1000
//    }.fold({ str: String -> str.length }, { int -> int })
//    res shouldBe 1000
//}

import arrow.core.continuations.effect
import io.kotest.matchers.shouldBe

suspend fun main() {
    val condition = true
    val failure = "failed"
    val int = 4
    effect<String, Int> {
        ensure(condition) { failure }
        int
    }.toEither() shouldBe if(condition) Either.Right(int) else Either.Left(failure)
}
