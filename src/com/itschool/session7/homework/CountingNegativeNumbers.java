package com.itschool.session7.homework;

public class CountingNegativeNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -4, 5, 6, 7, -8, 9, -10};
        int count = 0;

        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }

        System.out.println("Number of negative numbers: " + count);
    }
}
