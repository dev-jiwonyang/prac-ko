package functional.chapter2

enum class Error(val num: Int) {
    FAULT(1) {
        override fun getErrorName(): String {
            return "FAULT"
        }
    },

    WARN(2) {
        override fun getErrorName(): String {
            return "WARN"
        }
    };

    abstract fun getErrorName(): String
}

fun enumBranch(e: Error): String = when(e) {
    Error.FAULT -> e.getErrorName()
    Error.WARN -> e.getErrorName()
}

sealed class Expr
data class Const(val num: Int): Expr()
data class Sum(val x: Int, val y: Int): Expr()
object NotANum: Expr()

fun sealedBranch(expr: Expr): Int = when(expr) {
    is Const -> expr.num
    is Sum -> expr.x + expr.y
    NotANum -> 0
}

fun main() {
    println(Error.FAULT.getErrorName())
}