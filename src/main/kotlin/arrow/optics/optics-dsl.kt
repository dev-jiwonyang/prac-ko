package arrow.optics

import arrow.optics.domain.Address
import arrow.optics.domain.Company
import arrow.optics.domain.Employee
import arrow.optics.domain.Street

import arrow.optics.domain.address
import arrow.optics.domain.company
import arrow.optics.domain.name
import arrow.optics.domain.street

/*
* <optics DSL>
* Optics들을 compose하여 유용성, 가독성을 향상
* DSL 조건 -> 1. @optics 로 어노테이트 2. companion object 내부 선언(optic 속성이 여기 extend 됨)
* */

val john = Employee("John Doe", Company("Kategory", Address("Functional city", Street(42, "lambda street"))))

fun main() {

    val optional: Optional<Employee, String> = Employee.company.address.street.name

    optional.modify(john, String::uppercase)
}
