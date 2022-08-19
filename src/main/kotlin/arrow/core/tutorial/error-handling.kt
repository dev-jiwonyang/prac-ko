package arrow.core

import arrow.core.continuations.either

object Lettuce
object Knife
object Salad

sealed class CookingException {
    object NastyLettuce: CookingException()
    object KnifeIsDull: CookingException()
    data class InsufficientAmountOfLettuce(val quantityInGrams : Int): CookingException()
}
typealias NastyLettuce = CookingException.NastyLettuce
typealias KnifeIsDull = CookingException.KnifeIsDull
typealias InsufficientAmountOfLettuce = CookingException.InsufficientAmountOfLettuce

fun takeFoodFromRefrigerator(): Either<NastyLettuce, Lettuce> =
    Either.Right(Lettuce)
fun getKnife(): Either<KnifeIsDull, Knife> =
    Either.Right(Knife)
fun lunch(knife: Knife, food: Lettuce): Either<InsufficientAmountOfLettuce, Salad> =
    Either.Left(InsufficientAmountOfLettuce(5))

suspend fun prepareEither(): Either<CookingException, Salad> =
    either {
        val lettuce = takeFoodFromRefrigerator().bind()
        val knife = getKnife().bind()
        val salad = lunch(knife, lettuce).bind() // whenever a Left value is found, the computation short-circuits
        salad
    }

suspend fun main() {
    println(prepareEither())
}
