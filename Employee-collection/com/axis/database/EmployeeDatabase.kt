package com.axis.database

import com.axis.modal.Employee

class EmployeeDatabase {

    var employees= mutableListOf<Employee>()

    init {
        employees.add(Employee(1,"Radha",80000,"Testing"))
        employees.add(Employee(2,"Ram",75000,"HR"))
        employees.add(Employee(3,"Lavanya",52000,"Bench"))
        employees.add(Employee(4,"Swathi",69000,"Project"))



    }

    fun employeeData():MutableList<Employee>{
        return employees
    }
}