package arrow.core.validated

import arrow.core.Validated
import arrow.core.handleError

fun main() {
    val notAnEmail: Validated<ValidationErrors, Email> = Email("not an email")

    notAnEmail
        .tapInvalid { errors -> errors.forEach(::println) }
        .mapLeft { errors -> errors.map { it.message } }
        .handleError { errors -> errors.forEach(::println) }

    val email: Validated<ValidationErrors, Email> = Email("valid@email")

    email.tap { email -> println(email()) }
    email
        .tap { email -> println(email()) }
        .map { email -> email() }
        .map { println(it) }

}
