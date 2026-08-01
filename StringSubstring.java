/*
Question:
Write a Java program to extract a substring from a String.

Concepts Covered:
- String
- substring() Method
- Variables
- System.out.println()

Sample Output:
Original String = Java Programming
Substring = Programming

Explanation:
The substring() method is used to extract a part of a String.
The index starts from 0.
substring(5) returns the String from index 5 to the end.


*/

public class StringSubstring {

    public static void main(String[] args)
  {
        String text = "Java Programming";

         System.out.println("Original String = " + text);

        String sub = text.substring(5);

         System.out.println("Substring = " + sub);

   }
}
