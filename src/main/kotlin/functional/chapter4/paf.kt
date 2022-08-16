package functional.chapter4

import java.lang.Integer.min
import kotlin.math.max

// 추상화 X
fun <P1, P2, P3, R> ((P1, P2, P3) -> R).partial(p1: P1): (P2, P3) -> R = { p2, p3 -> this(p1, p2, p3) }

// 추상화
fun <P1, P2, P3, R> ((P1, P2, P3) -> R).curried(): (P1) -> (P2) -> (P3) -> R
    =  { p1: P1 -> { p2: P2 -> { p3: P3 -> this(p1, p2, p3) }}}

fun <P> ((P, P) -> P).twoCurrying(): (P) -> (P) -> P
        = { p1: P -> { p2: P -> this(p1, p2) }}


fun maxVal(a: Int): (Int) -> Int = { b -> max(a, b) }
val minVal = { x:Int, y:Int -> min(x, y) }

fun main() {
    val multipleThree = { a: Int, b: Int, c: Int -> a * b * c }

    val partialResult = multipleThree.partial(1)
    val result = partialResult(2, 3)

    val curried = multipleThree.curried()
    println(curried(1)(2)(3))

    println(maxVal(1)(2))
    println(minVal.twoCurrying()(1)(2))
}


