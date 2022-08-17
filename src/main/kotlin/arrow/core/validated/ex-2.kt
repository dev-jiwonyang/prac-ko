package arrow.core.validated

import arrow.core.Validated
import arrow.core.zip
import arrow.typeclasses.Semigroup


fun main() {
    val from: Validated<ValidationErrors, Email> = Email("no-reply@localhost")
    val to: Validated<ValidationErrors, Email> = Email("test@localhost")

    val zip = from
        .zip(Semigroup.nonEmptyList(), to)

    println(zip)

    val validatedEmailRoute: Validated<ValidationErrors, EmailRoute> =
        from
            .zip(Semigroup.nonEmptyList(), to) { validFrom, validTo -> EmailRoute(validFrom, validTo) }
            .tap(::println)
//    EmailRoute(from=Email(value=no-reply@localhost), to=Email(value=test@localhost), cc=[], bcc=[])
}
