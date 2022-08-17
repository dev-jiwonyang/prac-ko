package arrow.optics.domain

import arrow.optics.optics

@optics data class Db(val content: Map<Int, String>) {
    companion object
}
