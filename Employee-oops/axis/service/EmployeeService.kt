package com.axis.service

import com.axis.modal.Employee

//in service class we write business logic
class EmployeeService {

    /*
    description: this method is used to display employee details
    @param: It takes employee objects as parameter
    return: It returns unit
    */
    fun displayEmployeeDetails(employee: Employee){
        println("--------Employee Information--------")
        println("Id: ${employee.id}")
        println("Name: ${employee.name}")
        println("Salary: ${employee.salary}")
    }
    /*
    To find per day Salary
    */
    fun perDaySalary(employee: Employee):Int{
        return employee.salary/30
    }

    fun increaseSalaryTenPercentage(employee: Employee):Double{
        var incrementedSalary=employee.salary*0.10
        println("10% salary is: $incrementedSalary")

        return incrementedSalary+employee.salary
    }
}