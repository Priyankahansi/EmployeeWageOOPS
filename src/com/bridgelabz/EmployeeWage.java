package com.bridgelabz;

public class EmployeeWage {

    static int EMP_RATE_PER_HOUR = 20;
    static int empHrs = 0;
    static int empWage = 0;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    //UC1
    static void method1() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }

    //creating another method UC2
    void dailyEmployeeWage() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage:" + empWage);
    }

    //UC3
    static void partTimeEmployeeWage() {

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_PART_TIME)
            empHrs = 4;
        else if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage:" + empWage);
    }

    static void employeeWageSwitchStatements() {
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage:" + empWage);

    }

    public static void main(String[] args) {
        EmployeeWage obj2 = new EmployeeWage();
        method1();//calling first method
        obj2.dailyEmployeeWage();//calling second method UC2.
        partTimeEmployeeWage();//calling third method UC3.
        employeeWageSwitchStatements();
    }
}