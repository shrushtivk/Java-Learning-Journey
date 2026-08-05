/*
Question:
Write a Java program to check whether a String contains a given word
using the contains() method.

Concepts Covered:
- String
- contains() Method
- boolean Data Type
- Variables
- System.out.println()

Sample Output:
String = Java Programming

Contains "Java" = true
Contains "Python" = false

Explanation:
The contains() method checks whether a specified word or sequence
of characters is present in a String.
It returns true if found; otherwise, it returns false.


*/

public class StringContains {

    public static void main(String[] args) 
  {
        String text = "Java Programming";
    
         System.out.println("String = " + text);
 
        boolean result1 = text.contains("Java");
          boolean result2 = text.contains("Python");

        System.out.println("\nContains \"Java\" = " + result1);
         System.out.println("Contains \"Python\" = " + result2);

   }
}
