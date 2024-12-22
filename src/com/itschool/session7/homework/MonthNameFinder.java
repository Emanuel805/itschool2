package com.itschool.session7.homework;
/*Write a program that asks the user to enter a number between 1 and 12.
 Print the name of the corresponding month or "Invalid Month" if out of range.
 */

import java.util.Scanner;

public class MonthNameFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = scanner.nextInt();

        String monthName;
        switch (monthNumber) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> monthName = "Invalid Month";
        }

        System.out.println(monthName);
    }
}


