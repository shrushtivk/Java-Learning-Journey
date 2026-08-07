/*
Question:
Write a Java program to accept a String from the user and print it.

Concepts Covered:
- String
- Scanner Class
- User Input
- Variables
- nextLine() Method (reads the entire line,including the spaces)
- System.out.println()

Sample Input:
Enter your name:
Ram

Sample Output:
Hello, Ram

Explanation:
This program accepts a String from the user using the Scanner class.
The entered String is stored in a variable and displayed on the screen.


*/

import java.util.Scanner;

public class StringUserInput {

     public static void main(String[] args) 
  {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter your name: ");
         String name = sc.nextLine();

         System.out.println("Hello, " + name);
    }
}
