package functional.chapter2

interface Foo {
    val x: Int
        get() = 3

    fun foo()

    fun print(){
        println("FOO")
    }
}

interface BOO {
    fun boo()

    fun print(){
        println("BOO")
    }
}

class KO: Foo, BOO {


    override fun foo() {
        println("f")
    }

    override fun boo() {
        println("b")
    }

    override fun print() {
        super<Foo>.print()
    }
}

fun main() {
    val ko = KO()
    ko.print()
}