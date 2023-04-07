package com.simformsolutions.inheritance;

public class Main {
    public static void main(String[] args) {
        ProductionWorker worker1 = new ProductionWorker("Arpit", 198, "1/02/19");
        ProductionWorker worker2 = new ProductionWorker("Parth", 160, "1/06/18");
        worker1.employeeDetails();
        worker1.Shift(1);
        worker1.HourlyPay(200);
        System.out.println();
        worker2.employeeDetails();
        worker2.Shift(2);
        worker2.HourlyPay(300);
    }
}
