package functional.chapter3

fun List<Int>.head() = first()
fun List<Int>.tail() = drop(1)

//fun maximum(list: List<Int>): Int {
//    return when {
//        list.isEmpty() -> throw IllegalArgumentException()
//        list.size == 1 -> list.head()
//        else -> {
//            val head = list.head()
//            val tail = list.tail()
//            val maxVal = maximum(tail)
//            if (head > maxVal) head else maxVal
//        }
//    }
//}

tailrec fun tailrecMaximum(list: List<Int>, acc: Int = Int.MIN_VALUE): Int {
    return when {
        list.isEmpty() -> throw IllegalArgumentException()
        list.size == 1 -> acc
        else -> {
            val head = list.head()
            val maxVal = if (head > acc) head else acc
            tailrecMaximum(list.tail(), maxVal)
        }
    }
}
