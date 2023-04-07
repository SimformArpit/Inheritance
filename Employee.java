package com.simformsolutions.inheritance;

public class Employee {
    String name;
    int Id;
    String hireDate;

    public Employee(String name, int id, String hireDate) {
        this.name = name;
        this.Id = id;
        this.hireDate = hireDate;
    }

    public void employeeDetails() {
        System.out.println("Employee name is     : " + name + "\nEmployee id is       : " + Id + "\nEmployee HireDate is : " + hireDate);
    }

}
