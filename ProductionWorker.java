package com.simformsolutions.inheritance;

public class ProductionWorker extends Employee {
    public ProductionWorker(String name, int id, String hireDate) {
        super(name, id, hireDate);

    }

    public void Shift(int shift) {

        if (shift == 1)
            System.out.println("Employee " + name + " is working : Day shift");
        else if (shift == 2)
            System.out.println("Employee " + name + " is working on : Night Shift");
        else
            System.out.println(" INVALID SHIFT");
    }

    public void HourlyPay(int hourlyPay) {
        System.out.println("Employee " + name + " is hourly paid " + hourlyPay);
        ;
    }
}
