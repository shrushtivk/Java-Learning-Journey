/*
Question:
Write a Java program to display a character at a given index using the charAt() method.

Concepts Covered:
- String
- char Data Type
- charAt() Method
- Variables
- System.out.println()

Sample Output:
String = Java Programming

Character at index 0 = J
Character at index 2 = v
Character at index 5 = P

Explanation:
The charAt() method returns the character present at the specified index.
The index starts from 0.

*/

public class StringCharAt {

    public static void main(String[] args)
  {
        String text = "Java Programming";
 
         System.out.println("String = " + text);
 
         System.out.println("\nCharacter at index 0 = " + text.charAt(0));

         System.out.println("Character at index 2 = " + text.charAt(2));
          System.out.println("Character at index 5 = " + text.charAt(5));

   }
}
