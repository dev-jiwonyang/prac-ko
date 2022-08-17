package arrow.optics

import arrow.optics.domain.Address
import arrow.optics.domain.Company
import arrow.optics.domain.Db
import arrow.optics.domain.Employee
import arrow.optics.domain.Employees
import arrow.optics.domain.Street
import arrow.optics.domain.address
import arrow.optics.domain.company
import arrow.optics.domain.content
import arrow.optics.domain.employees
import arrow.optics.domain.name
import arrow.optics.domain.street
import arrow.optics.dsl.at
import arrow.optics.dsl.every
import arrow.optics.dsl.index
import arrow.optics.dsl.some
import arrow.optics.typeclasses.At
import arrow.optics.typeclasses.Index
import io.kotest.matchers.shouldBe


val jane = Employee("Jane Doe", Company("Kategory", Address("Functional city", Street(42, "lambda street"))))
val employees = Employees(listOf(john, jane))

fun main() {

    // every
    Employees.employees.every(Every.list<Employee>())
        .company.address.street.name.modify(employees, String::capitalize)

    // at
    val db = Db(mapOf( 1 to "one", 2 to "two"))
    val modify = Db.content.at(At.map(), 1).some.modify(db, String::reversed)
    modify.content[1] shouldBe "eno"

    // index
    val updatedJohn = Employees.employees.index(Index.list(), 0).company.address.street.name.modify(employees, String::capitalize)
    updatedJohn.employees[0].company?.address?.street?.name shouldBe "Lambda street"

    // scope 내에서 인스턴스를 specify 할 필요가 없음
    Index.list<Employee>().run {
        Employees.employees[0].company.address.street.name.getOrNull(updatedJohn)
    }
}
