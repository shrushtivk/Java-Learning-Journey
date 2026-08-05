/*
Question:
Write a Java program to check whether a String starts with or ends with
a given word using the startsWith() and endsWith() methods.

Concepts Covered:
- String
- startsWith() Method
- endsWith() Method
- boolean Data Type
- Variables
- System.out.println()

Sample Output:
String = Java Programming

Starts with "Java" = true
Ends with "Programming" = true
Starts with "Python" = false
Ends with "Java" = false

Explanation:
The startsWith() method checks whether a String begins with a given word.
The endsWith() method checks whether a String ends with a given word.
Both methods return true or false.


*/

public class StringStartsEndsWith {

    public static void main(String[] args)
  {
     String text = "Java Programming";

         System.out.println("String = " + text);

          System.out.println("\nStarts with \"Java\" = " + text.startsWith("Java"));
  
        System.out.println("Ends with \"Programming\" = " + text.endsWith("Programming"));
 
          System.out.println("Starts with \"Python\" = " + text.startsWith("Python"));

         System.out.println("Ends with \"Java\" = " + text.endsWith("Java"));


  }
}
