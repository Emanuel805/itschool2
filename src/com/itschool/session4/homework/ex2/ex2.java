package com.itschool.session4.homework.ex2;

import java.util.Scanner;
//Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti latime: ");
        double lungime = scanner.nextDouble();

        System.out.print("Introduceti lungime: ");
        double latime = scanner.nextDouble();

        double aria = lungime * latime;

        System.out.println("Aria dreptunghiului este: " + aria);

        scanner.close();
    }
}
