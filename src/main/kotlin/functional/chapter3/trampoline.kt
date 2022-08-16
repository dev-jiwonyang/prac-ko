package functional.chapter3


/*
* 기존 코드는 값이 커지면 SOF 를 발생시킴
* ex) println(odd(99999))
* */

//fun even(n: Int): Boolean = when(n) {
//    0 -> true
//    else -> odd(n-1)
//}
//
//fun odd(n: Int): Boolean = when(n) {
//    0 -> false
//    else -> even(n-1)
//}

sealed class Bounce<A>
data class Done<A>(val result: A): Bounce<A>()
data class More<A>(val thunk: () -> Bounce<A>): Bounce<A>()

tailrec fun <A> trampoline(bounce: Bounce<A>): A = when (bounce) {
    is Done -> bounce.result
    is More -> trampoline(bounce.thunk())
}

fun even(n: Int): Bounce<Boolean> = when(n) {
    0 -> Done(true)
    else -> More { odd(n-1) }
}

fun odd(n: Int): Bounce<Boolean> = when(n) {
    0 -> Done(false)
    else -> More { even(n-1) }
}

fun main() {
//    println(even(999))
    println(trampoline(odd(4)))
//    println(odd(4))
}

