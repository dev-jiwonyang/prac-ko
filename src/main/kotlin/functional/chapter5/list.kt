package functional.chapter5

sealed class FunList<out T> // TODO : 여기 out 왜 붙여하는지 모르겠음
object Nil : FunList<Nothing>()
data class Cons<T>(val head: T, val tail: FunList<T>) : FunList<T>()

fun <T> FunList<T>.addHead(head: T): FunList<T> = Cons(head, this)

fun <T> FunList<T>.addTail(value: T): FunList<T> = when(this) {
    Nil -> Cons(value, Nil)
    is Cons -> Cons(head, tail.addTail(value))
}

tailrec fun <T> FunList<T>.reverse(acc: FunList<T> = Nil): FunList<T> = when (this) {
    Nil -> acc
    is Cons -> tail.reverse(acc.addHead(head))
}

tailrec fun <T> FunList<T>.appendTail(value: T, acc: FunList<T> = Nil): FunList<T> = when(this) {
    Nil -> Cons(value, acc).reverse()
    is Cons -> tail.appendTail(value, acc.addHead(head))
}

fun <T> FunList<T>.getTail(): FunList<T> = when (this) {
    Nil -> throw NoSuchElementException()
    is Cons -> tail
}

fun <T> FunList<T>.getHead(): T = when(this) {
    Nil -> throw NoSuchElementException()
    is Cons -> head
}

fun main() {
    val list: FunList<Int> = Cons(1, Cons(2, Nil))
    println(list)
}
