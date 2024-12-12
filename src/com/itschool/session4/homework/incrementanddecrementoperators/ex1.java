package com.itschool.session4.homework.incrementanddecrementoperators;
/*Write a Java program that uses both the increment (++) and decrement (--)
operators in a loop to count up to 10 and then back down to 1
 */
public class ex1 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.print(x);
        }

        for (int x = 9; x >= 1; x--) {
            System.out.print(x);

        }
    }
}
