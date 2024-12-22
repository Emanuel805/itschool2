package com.itschool.session7.homework;
/*Ask the user to enter a string. Print
the reversed version of this string.
 */
import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() -1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        /*String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
         */

    }
}
