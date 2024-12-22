package com.itschool.session7.homework;
/*Write a Java program that takes an integer as input. If the number is even, print "Even".
 If it's odd, print "Odd".
 */

import java.util.Scanner;

public class EvenOrOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = scanner.nextInt();

        String num = number % 2 == 0 ? "even" : "odd";

        System.out.println("Number is " + num);


        /*if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }*/
    }
}
