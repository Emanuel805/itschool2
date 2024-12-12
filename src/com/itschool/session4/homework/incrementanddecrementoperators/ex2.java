package com.itschool.session4.homework.incrementanddecrementoperators;

import java.util.Scanner;

public class ex2 {
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
