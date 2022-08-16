fun main() {
    println(lazyValue)
    println(lazyValue)
    println(value)
}

val lazyValue by lazy {
    println("오래 걸리는 작업")
    "hello"
}

fun calculate(x: Int, y: Int, calFun: (Int, Int) -> Int): Int {
    return calFun(x, y)
}

val value = calculate(1, 2) { x, y -> x + y }

