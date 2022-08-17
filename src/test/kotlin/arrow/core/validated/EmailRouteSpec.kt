package arrow.core.validated

import arrow.core.invalid
import arrow.core.nonEmptyListOf
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class EmailRouteSpec : FreeSpec({

    "should accumulate errors" {
        val emailRoute = EmailRoute.validated(
            "invalid-from",
            "invalid-to",
            listOf("invalid-cc"),
            listOf("invalid-bcc")
        )

        emailRoute shouldBe nonEmptyListOf(
            ValidationError("invalid-from should be a valid email address"),
            ValidationError("invalid-to should be a valid email address"),
            ValidationError("invalid-cc should be a valid email address"),
            ValidationError("invalid-bcc should be a valid email address")
        ).invalid()
    }
})
