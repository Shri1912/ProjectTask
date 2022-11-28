package com.axis.service

import com.axis.database.EmployeeDatabase
import com.axis.modal.Employee

class EmployeeService {

    var employeeDatabase = EmployeeDatabase()

    fun viewAllEmployees() {
        var employees = employeeDatabase.employeeData()

        for (employee in employees) {
            println("${employee.id} \t ${employee.name} \t ${employee.salary} \t ${employee.department}")

        }

    }

    fun addNewEmployee(employee: Employee): String {

        employeeDatabase.employeeData().add(employee)
        return "Successfullly Added!!"
    }
}
