package com.itschool.session4.homework.binaryarithmeticoperators;

import java.util.Scanner;

/*Write a Java program to take two numbers as input and display the result of addition,
subtraction, multiplication, division, and modulus.
 */


public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double nr1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double nr2 = scanner.nextDouble();

        double addition = nr1 + nr2;
        double subtraction = nr1 - nr2;
        double multiplication = nr1 * nr2;
        double division = nr1 / nr2;
        double modulus = nr1 % nr2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.printf("Division: %.2f\n" , division);
        System.out.println("Modulus: " + modulus);

        scanner.close();
    }
}

