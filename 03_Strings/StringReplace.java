/*
Question:
Write a Java program to replace a word in a String using the replace() method.

Concepts Covered:
- String
- replace() Method
- Variables
- System.out.println()

Sample Output:
Original String = I like Java
Updated String = I like Python

Explanation:
The replace() method replaces a specified word or character
with another word or character and returns a new String.


*/

public class StringReplace {

    public static void main(String[] args)
  {

        String text = "I like Java";
 
         System.out.println("Original String = " + text);

         String updatedText = text.replace("Java", "Python");

          System.out.println("Updated String = " + updatedText);

  }
}
