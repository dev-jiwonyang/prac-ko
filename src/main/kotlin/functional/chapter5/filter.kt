package functional.chapter5

tailrec fun <T> FunList<T>.filter(acc: FunList<T> = Nil, p: (T) -> Boolean): FunList<T>
    = when(this) {
        Nil -> acc.reverse()
        is Cons -> if (p(head)) {
            tail.filter(acc.addHead(head), p)
        } else {
            tail.filter(acc, p)
        }
    }

tailrec fun <T> FunList<T>.drop(n: Int): FunList<T>
    = when {
        n < 0 -> throw IllegalArgumentException()
        n == 0 || this == Nil -> this
        else -> getTail().drop(n-1)
    }

tailrec fun <T> FunList<T>.dropWhile(p: (T) -> Boolean): FunList<T>
    = when(this) {
        Nil -> this
        is Cons -> if (p(head)) {
            this
        } else {
            tail.dropWhile(p)
        }
    }

tailrec fun <T> FunList<T>.take(n: Int, acc:FunList<T> = Nil): FunList<T>
    = when {
        n < 0 -> throw IllegalArgumentException()
        n == 0 || this == Nil -> acc.reverse()
        else -> getTail().take(n-1, acc.addHead(getHead()))
    }

tailrec fun <T> FunList<T>.takeWhile(acc: FunList<T> = Nil, p: (T) -> Boolean): FunList<T> = when (this) {
    Nil -> acc.reverse()
    is Cons -> when (p(head)) {
        false -> acc.reverse()
        true -> tail.takeWhile(acc.addHead(head), p)
    }
}

fun main() {
    val intList = Cons(1, Cons(2, Cons(3, Nil)))
    println(intList.take(2))

}
