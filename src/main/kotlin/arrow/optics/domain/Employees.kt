package arrow.optics.domain

import arrow.optics.optics

@optics
data class Employees(val employees: List<Employee>) {
    companion object
}
