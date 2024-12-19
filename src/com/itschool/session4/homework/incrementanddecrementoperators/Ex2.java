package com.itschool.session4.homework.incrementanddecrementoperators;

import java.util.Scanner;
/*Create a program that takes an integer as input and then increments and decrements it by 1,
displaying the output at each stage.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu numar:");
        double numar = input.nextDouble();
        numar++;
        System.out.println("" + numar); //dupa incrementare
        numar--;
        System.out.println("" + numar); // dupa decrementare
    }
}
