package arrow.optics

import io.kotest.matchers.shouldBe

/* Lens<S, A>
S : source of Lens, A : target of Lens
get : (S) -> A
set : (A) -> (S) -> S
*/

data class Player(val health: Int)

val playerLens: Lens<Player, Int> = Lens(
    get = { player -> player.health },
    set = { player, value -> player.copy(health = value) }
)

val player = Player(70)

fun main() {
    val get = playerLens.get(player)
    get shouldBe 70

    val set = playerLens.set(player, 100)
    set.health shouldBe 100

    val modify = playerLens.modify(player) { it + 20 }
    modify.health shouldBe 90

    val lift: (Player) -> Player = playerLens.lift { it + 10 }
    lift(player).health shouldBe 80
}
