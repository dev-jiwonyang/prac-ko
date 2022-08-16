package functional.chapter2

fun <T> box(t: T): T {
    return t
}

fun main() {
    box(1)
}