package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // Ask for employee name
        System.out.print("Enter your name: ");
        String name = read.nextLine();

        // Ask for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = read.nextDouble();

        // Ask for pay rate
        System.out.print("Enter pay rate: ");
        double payRate = read.nextDouble();

        // Calculate gross pay
        double grossPay = hoursWorked * payRate;

        // BONUS: Calculate overtime if employee worked more than 40 hours
        if (hoursWorked > 40) {

            double overtimeHours = hoursWorked - 40;
            double regularPay = 40 * payRate;
            double overtimePay = overtimeHours * payRate * 1.5;

            grossPay = regularPay + overtimePay;
        }

        // Display results
        System.out.println("Employee: " + name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

        read.close();
    }
}
