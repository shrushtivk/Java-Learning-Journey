/*
Question:
Write a Java program to find the index (position) of a character
and a word in a String using the indexOf() method.

Concepts Covered:
- String
- indexOf() Method
- Variables
- int Data Type
- System.out.println()

Sample Output:
String = Java Programming

Index of 'P' = 5
Index of "Programming" = 5

Explanation:
The indexOf() method returns the position of a character or word
in a String. The index starts from 0.
If the character or word is not found, it returns -1.

*/



public class StringIndexOf {

    public static void main(String[] args)
  {
        String text = "Java Programming";

          System.out.println("String = " + text);

         int index1 = text.indexOf('P');
        int index2 = text.indexOf("Programming");

        System.out.println("\nIndex of 'P' = " + index1);
         System.out.println("Index of \"Programming\" = " + index2);

   }
}
