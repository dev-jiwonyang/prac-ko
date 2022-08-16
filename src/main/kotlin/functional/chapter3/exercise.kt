package functional.chapter3

// 3-4
private fun toBinary(n: Int): String = when {
    n < 2 -> n.toString()
    else -> toBinary(n / 2) + (n % 2).toString()
}

// 3-5
private fun replicate(n: Int, element: Int): List<Int> = when {
    n <= 0 -> listOf()
    else -> listOf(element) +  replicate(n-1, element)
}

// 3-6
private fun elem(num: Int, list: List<Int>): Boolean = when {
    list.isEmpty() -> false
    list.head() == num -> true
    else -> elem(num, list.tail())
}

// zip
private fun zip(list1: List<Int>, list2: List<Int>): List<Pair<Int, Int>> = when {
    list1.isEmpty() || list2.isEmpty() -> listOf()
    else -> listOf(Pair(list1.head(), list2.head())) + zip(list1.tail(), list2.tail())
}

// 3-12
tailrec fun factorial(n: Int, acc: Int = 1): Int = when (n) {
    0 -> acc
    else -> factorial(n - 1, n * acc)
}

fun main() {
    println(replicate(3, 5))
}
