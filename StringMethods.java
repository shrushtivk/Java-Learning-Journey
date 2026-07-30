/*
Question:
Write a Java program to demonstrate commonly used String methods.

Concepts Covered:
- String
- toUpperCase()
- toLowerCase()
- trim()
- Variables
- System.out.println()

Sample Output:
Original String =   Hello Java  

After trim() = Hello Java
Upper Case = HELLO JAVA
Lower Case = hello java

Explanation:
This program demonstrates some commonly used String methods.
trim() removes extra spaces from the beginning and end of the String.
toUpperCase() converts all characters into uppercase.
toLowerCase() converts all characters into lowercase.

*/

public class StringMethods {

    public static void main(String[] args)
  {
       String text = "  Hello Java  ";

        System.out.println("Original String = " + text);

         System.out.println("After trim() = " + text.trim());

         System.out.println("Upper Case = " + text.toUpperCase());

        System.out.println("Lower Case = " + text.toLowerCase());

   }
}
