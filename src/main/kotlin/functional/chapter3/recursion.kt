package functional.chapter3

fun factorial(n: Int): Int = when {
    n <= 1 -> 1
    else -> n * factorial(n-1)
}

fun main() {
    println(factorial(0))
    println(factorial(3))
}
