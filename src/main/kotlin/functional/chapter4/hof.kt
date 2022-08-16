package functional.chapter4

fun main() {
    val sum: (Int, Int) -> Int = { x, y -> x + y }

    println(hof(sum, 1, 2))
}

fun hof(function: (Int, Int) -> Int, x: Int, y: Int): Int = function(x, y)
