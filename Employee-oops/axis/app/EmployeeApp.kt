package com.axis.app

import com.axis.modal.Employee
import com.axis.service.EmployeeService

fun main(args: Array<String>) {
    println("------Employee App-------")

    var employee=Employee(1,"Sourabha",45000)
    var employeeService=EmployeeService()
    employeeService.displayEmployeeDetails(employee)

    println("Per day salary: ${employeeService.perDaySalary(employee)}")
    println("Increase salary by 10%: ${employeeService.increaseSalaryTenPercentage(employee)}")

}