package arrow.core.validated

import arrow.core.nonEmptyListOf
import io.kotest.assertions.arrow.core.shouldBeInvalid
import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.arrow.core.shouldBeValid
import io.kotest.matchers.shouldBe

class EmailSpec: FreeSpec({

    "Email.valueOf should return valid" - {
        val validEmail = "test@naver.com"
        "$validEmail should be valid" {
            val email: Email = Email(validEmail).shouldBeValid()

            email.value shouldBe validEmail
        }
    }

    "Email.valueOf should return Invalid" - {
//        val nullEmail = null
//        "should invalidate null" {
//            val errors: ValidationErrors = Email.valueOf(nullEmail).shouldBeInvalid()
//
//            errors shouldBe nonEmptyListOf(
//                ValidationError("email should not be null")
//            )
//        }

        val invalidEmail = "test"
        "$invalidEmail should be invalid" {
            Email(invalidEmail) shouldBeInvalid nonEmptyListOf(
                ValidationError("$invalidEmail should be a valid email address")
            )
        }
    }
})
