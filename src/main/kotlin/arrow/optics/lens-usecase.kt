package arrow.optics

/* 활용 : composition
lens는 nested 구조에서 getter, setter을 compose하여 telescope을 제공
*/

//data class Street(val number: Int, val name: String)
//data class Address(val city: String, val street: Street)
//data class Company(val name: String, val address: Address)
//data class Employee(val name: String, val company: Company)
//
//val employee = Employee("John Doe", Company("Arrow", Address("Functional city", Street(23, "lambda street"))))
//
///*
//Q. how to capitalize name of Street?
//A. use lens and its composition!
//*/
//val employeeCompany: Lens<Employee, Company> = Lens(
//    get = { it.company },
//    set = { employee, company -> employee.copy(company = company) }
//)
//
//val companyAddress: Lens<Company, Address> = Lens(
//    get = { it.address },
//    set = { company, address -> company.copy(address = address) }
//)
//
//val addressStreet: Lens<Address, Street> = Lens(
//    get = { it.street },
//    set = { address, street -> address.copy(street = street) }
//)
//
//val streetName: Lens<Street, String> = Lens(
//    get = { it.name },
//    set = { street, name -> street.copy(name = name) }
//)
//
//val employeeStreetName = employeeCompany compose companyAddress compose addressStreet compose streetName
//
//fun main() {
//    employeeStreetName.modify(employee, String::capitalize)
//}
