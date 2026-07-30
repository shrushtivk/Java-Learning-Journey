/*
Question:
Write a Java program to find the length of a String.

Concepts Covered:
- String
- Scanner Class
- User Input
- length() Method
- Variables
- System.out.println()

Sample Input:
Enter a String:
Java Programming

Sample Output:
Length of the String = 16

Explanation:
This program accepts a String from the user using the Scanner class.
The length() method returns the total number of characters in the String,
including spaces.


*/

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args)
  {

        Scanner sc = new Scanner(System.in);

         System.out.print("Enter a String: ");
          String text = sc.nextLine();

         int length = text.length();

          System.out.println("Length of the String = " + length);

   }
}
