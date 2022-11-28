package com.axis.app

import com.axis.modal.Employee
import com.axis.service.EmployeeService

fun main() {

    var employeeService = EmployeeService()


//Adding Employee
    var employee = Employee(5, "Vanshi", 860000, "MR")
    employeeService.addNewEmployee(employee)

    employeeService.viewAllEmployees()
}