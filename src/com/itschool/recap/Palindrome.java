package com.itschool.recap;
/*Create a Java program to check if a given word
is a palindrome using a loop.
 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() -1; i >= 0; i--) { //i--
            reversed += input.charAt(i); //input.charAt(i) gets the character at the current index i of the userInput string.
            /*input.length() - 1 gives the index of the last
            character because string indices start at 0.
            i-- this decrements the value of i by 1 after each iteration of the loop.
            It ensures that the loop moves from the end of the string to the beginning.
             */
        }
        System.out.println("Reversed string: " + reversed);
        System.out.println(input.equals(reversed));

    }
}

