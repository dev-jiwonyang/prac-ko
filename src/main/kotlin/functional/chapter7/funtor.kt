package functional.chapter7

import kotlin.Nothing

interface Functor<out A> {
    fun <B> fmap(f: (A) -> B): Functor<B>
}

sealed class Maybe<out A>: Functor<A> {

    abstract override fun toString(): String

    abstract override fun <B> fmap(f: (A) -> B): Functor<B>
}


data class Just<out A>(val value: A): Maybe<A>() {

    override fun toString(): String = "Just($value)"

    override fun <B> fmap(f: (A) -> B): Maybe<B> = Just(f(value))
}

object Nothing: Maybe<kotlin.Nothing>() {

    override fun toString(): String = "Nothing"

    override fun <B> fmap(f: (Nothing) -> B): Maybe<B> = Nothing
}

