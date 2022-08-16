package functional.chapter6

sealed class Tree<out T>

object EmptyTree: Tree<Nothing>()

data class Node<T>(
    val value: T,
    val right: Tree<T> = EmptyTree,
    val left: Tree<T> = EmptyTree
): Tree<T>()

fun Tree<Int>.insert(element: Int): Tree<Int> =
    when(this) {
        EmptyTree -> Node(element)
        is Node -> when {
            element <= value -> Node(value, left.insert(element), right)
            else -> Node(value, left, right.insert(element))
        }
    }

//fun Tree<Int>.insertTailrec(elem: Int): Tree<Int> = rebuild(path(this, elem), elem)
//
//private fun path(tree: Tree<Int>, value: Int): FunStream<Pair<Tree<Int>, Boolean>> {
//
//    tailrec fun loop(tree: Tree<Int>,
//                     path: FunStream<Pair<Tree<Int>, Boolean>>): FunStream<Pair<Tree<Int>, Boolean>> =
//        when (tree) {
//            EmptyTree -> path
//            is Node -> when {
//                value < tree.value -> loop(tree.leftTree, path.addHead(tree to false))
//                else -> loop(tree.rightTree, path.addHead(tree to true))
//            }
//        }
//
//    return loop(tree, funStreamOf())
//}
//
//private fun rebuild(path: FunStream<Pair<Tree<Int>, Boolean>>, value: Int): Tree<Int> {
//
//    tailrec fun loop(path: FunStream<Pair<Tree<Int>, Boolean>>, subTree: Tree<Int>): Tree<Int> =
//        when (path) {
//            FunStream.Nil -> subTree
//            is FunStream.Cons -> when ((path.head()).second) {
//                false -> loop(path.tail(),
//                    Node((path.head().first as Node).value, subTree,
//                        (path.head().first as Node).rightTree))
//                true -> loop(path.tail(), Node((path.head().first as Node).value,
//                    (path.head().first as Node).leftTree, subTree))
//
//            }
//        }
//    return loop(path, Node(value, EmptyTree, EmptyTree))
//}

fun Tree<Int>.contains(element: Int): Boolean
    = when (this) {
        EmptyTree -> false
        is Node -> if (value == element) {
            true
        } else {
            if (value < element) {
                left.contains(element)
            } else {
                right.contains(element)
            }
        }
    }

fun main() {
    val tree = Node(0)
//    for(i in 1..1000000000) {
//        tree.insert(i)
//    }
    (1..100000).fold(EmptyTree as Tree<Int>) { acc, i ->
        acc.insert(i)
    }
}
