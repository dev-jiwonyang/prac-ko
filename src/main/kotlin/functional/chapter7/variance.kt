package functional.chapter7

interface Production<out T> {
    fun produce(): T
}

open class Food
open class FastFood : Food()
class Burger : FastFood()

class FoodStore : Production<Food> {
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}

class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood {
        println("Produce fast food")
        return FastFood()
    }
}

class InOutBurger : Production<Burger> {
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}

// 서브타입을---out---> 수퍼타입에 할당 가능
val production1 : Production<Food> = FoodStore()
val production2 : Production<Food> = FastFoodStore()
val production3 : Production<Food> = InOutBurger()

//val production1 : Production<Burger> = FoodStore()  // Error
//val production2 : Production<Burger> = FastFoodStore()  // Error
//val production3 : Production<Burger> = InOutBurger()


/*
* 컨슈머
* */

interface Consumer<in T> {
    fun consume(item: T)
}

class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food")
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat fast food")
    }
}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat burger")
    }
}

val consumer1 : Consumer<Burger> = Everybody()
val consumer2 : Consumer<Burger> = ModernPeople()
val consumer3 : Consumer<Burger> = American()

fun main() {
    production1.produce()
    production2.produce()
    production3.produce()

    consumer1.consume(Burger())
    consumer2.consume(Burger())
    consumer3.consume(Burger())
}
