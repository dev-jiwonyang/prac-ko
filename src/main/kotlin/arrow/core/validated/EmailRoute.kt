package arrow.core.validated

import arrow.core.NonEmptyList
import arrow.core.Validated
import arrow.core.ValidatedNel
import arrow.core.andThen
import arrow.core.handleError
import arrow.core.invalidNel
import arrow.core.traverseValidated
import arrow.core.valid
import arrow.core.zip
import arrow.typeclasses.Semigroup

data class ValidationError (val message: String)

typealias ValidationErrors = NonEmptyList<ValidationError>

fun <E, A, B, R> validate(
    a: ValidatedNel<E, A>,
    b: ValidatedNel<E, B>,
    f: (A, B) -> R
): ValidatedNel<E, R> = a.zip(Semigroup.nonEmptyList(), b, f)

fun <E, A, B, C, R> validate(
    a: ValidatedNel<E, A>,
    b: ValidatedNel<E, B>,
    c: ValidatedNel<E, C>,
    f: (A, B, C) -> R
): ValidatedNel<E, R> = a.zip(Semigroup.nonEmptyList(), b, c, f)

fun <E, A, B, C, D, R> validate(
    a: ValidatedNel<E, A>,
    b: ValidatedNel<E, B>,
    c: ValidatedNel<E, C>,
    d: ValidatedNel<E, D>,
    f: (A, B, C, D) -> R
): ValidatedNel<E, R> = a.zip(Semigroup.nonEmptyList(), b, c, d, f)

@JvmInline
value class Email private constructor(val value: String) {
    companion object {
        operator fun invoke(value: String): Validated<ValidationErrors, Email> =
            when {
                value == null -> ValidationError("email should not be null").invalidNel()
                isValidEmail(value) -> Email(value).valid()
                else -> ValidationError("$value should be a valid email address").invalidNel()
            }

        private fun isValidEmail(value: String) = value.contains('@')
    }

    operator fun invoke() = value
}

data class EmailRoute(
    val from: Email,
    val to: Email,
    val cc: List<Email> = emptyList(),
    val bcc: List<Email> = emptyList()
) {
    companion object {
        fun validated(
            from: String,
            to: String,
            cc: List<String>,
            bcc: List<String>
        ): Validated<ValidationErrors, EmailRoute> =
            validate(
                Email(from),
                Email(to),
                cc.traverseValidated { Email(it) },
                bcc.traverseValidated { Email(it) }
            ) { validFrom, validTo, validCc, validBcc ->
                EmailRoute(validFrom, validTo, validCc, validBcc)
            }. andThen { emailRoute ->
                if (emailRoute.cc.isEmpty() && emailRoute.bcc.isEmpty()) {
                    ValidationError("Both cc and bcc are empty").invalidNel()
                } else {
                    emailRoute.valid()
                }
            }
    }
}

