package functional.chapter4

import java.util.Collections.max

infix fun <F, G, R> ((F) -> R).compose(g: (G) -> F): (G) -> R
    = { gInput: G -> this(g(gInput)) }

fun main() {
    val max = { x: List<Int> -> max(x) }
    val power = { x:Int -> x * x }

    val list = listOf(1, 3, -4)
    val composed = power compose max
    println(composed(list))
}
