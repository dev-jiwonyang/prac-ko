package functional.chapter4

class PartialFunction<P, R>(
    private val condition: (P) -> Boolean,
    private val f: (P) -> R) :(P) -> R {

    override fun invoke(p: P): R {
        if (condition(p)) {
            return f(p)
        } else {
            throw IllegalArgumentException("$p isn't supported.")
        }
    }

    fun isDefinedAt(p: P): Boolean = condition(p)

    fun invokeOrElse(p: P, default: R): R = if (isDefinedAt(p)) invoke(p) else default

    fun orElse(that: PartialFunction<P, R>): PartialFunction<P, R> =
        PartialFunction({ it: P -> this.isDefinedAt(it) || that.isDefinedAt(it) },
            { it: P ->
                when {
                    this.isDefinedAt(it) -> this(it)
                    that.isDefinedAt(it) -> that(it)
                    else -> throw IllegalArgumentException("$it isn't defined")
                }
            }
        )
}

fun <P, R>((P) -> R).toPartialFunction(definedAt: (P) -> Boolean): PartialFunction<P, R> = PartialFunction(definedAt,this)

fun main() {

    val evenCondition: (Int) -> Boolean = { it % 2 == 0 }
    val evenBody: (Int) -> String = { "$it is even!" }

    val isEven = evenBody.toPartialFunction(evenCondition)
    val isOdd = { i: Int -> "$i is odd" }.toPartialFunction{ !evenCondition(it) }

    println(listOf(1, 2, 3).map { isEven.invokeOrElse(it, "$it is odd") })
    println(listOf(1, 2, 3).map { isEven.orElse(isOdd)(it) })
}
