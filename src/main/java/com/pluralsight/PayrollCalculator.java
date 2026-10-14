package com.pluralsight;

import java.util.Scanner;     // import the Scanner class
import java.util.*;

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




    }


}
