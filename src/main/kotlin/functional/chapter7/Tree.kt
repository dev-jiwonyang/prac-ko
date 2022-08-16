package functional.chapter7

import kotlin.Nothing

sealed class Tree<out A>: Functor<A> {

    abstract override fun toString(): String

    abstract override fun <B> fmap(f: (A) -> B): Tree<B>
}

object EmptyTree: Tree<kotlin.Nothing>() {

    override fun toString(): String = "Empty"

    override fun <B> fmap(f: (Nothing) -> B): Tree<B> = EmptyTree
}

data class Node<out A>(val value: A, val leftTree: Tree<A> = EmptyTree, val rightTree: Tree<A> = EmptyTree) : Tree<A>() {

    override fun toString(): String = "(N $value $leftTree $rightTree)"

    override fun <B> fmap(f: (A) -> B): Tree<B> =
        Node(f(value), leftTree.fmap(f), rightTree.fmap(f))
}


