package functional.chapter5

import java.lang.Math.max

tailrec fun <R, T> FunList<T>.foldLeft(acc: R, f: (R, T) -> R): R
    = when (this) {
        Nil -> acc
        is Cons -> tail.foldLeft(f(acc, head), f)
    }

fun FunList<Int>.maximumByFoldLeft(): Int = this.foldLeft(0) { acc, item -> max(acc, item) }

