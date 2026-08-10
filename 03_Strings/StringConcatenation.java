/*
Question:
Write a Java program to concatenate (join) two Strings.

Concepts Covered:
- String
- String Concatenation
- + Operator
- Variables
- System.out.println()

Sample Output:
First Name = Java 
Last Name = Programming 

Full Name = Java Programming 

Explanation:
String concatenation means joining two or more Strings together.
The '+' operator is used to combine Strings.


*/

public class StringConcatenation {

    public static void main(String[] args)
  {
        String firstName = "Java";
         String lastName = "Programming";

        System.out.println("First Name = " + firstName);
         System.out.println("Last Name = " + lastName);
  
         String fullName = firstName + " " + lastName;
 
          System.out.println("\nFull Name = " + fullName);
 
 }
}
