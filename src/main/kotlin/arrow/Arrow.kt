package arrow

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right

//sampleStart
//fun potentialThrowingCode(): String = throw RuntimeException("Blow up!")
fun potentialThrowingCode(): List<Int> = listOf<Int>(1, 2, 3)

suspend fun makeSureYourLogicDoesNotHaveSideEffects(): Either<Error, List<Int>> =
    Either
        .catch { potentialThrowingCode() }
        .mapLeft { Error.SpecificError }
        .flatMap {
            Error.SpecificError.left()
            println(it)
            listOf(1, 2).right()
        }

//sampleEnd
suspend fun main() {
    println("makeSureYourLogicDoesNotHaveSideEffects().isLeft() = ${makeSureYourLogicDoesNotHaveSideEffects().isLeft()}")
}

sealed class Error {
    object SpecificError : Error()
}
