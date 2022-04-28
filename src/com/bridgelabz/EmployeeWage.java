package com.bridgelabz;

public class EmployeeWage {

    static int IS_FULL_TIME = 1;

    static void method1() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }

    }

    public static void main(String[] args) {
        method1();
    }
}