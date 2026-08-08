/*
Question:
Write a Java program to compare two Strings using equals() and
equalsIgnoreCase() methods.

Concepts Covered:
- String
- equals()
- equalsIgnoreCase()
- boolean
- System.out.println()

Sample Output:
String 1 = Java
String 2 = java

Using equals() = false
Using equalsIgnoreCase() = true

Explanation:
The equals() method compares two Strings exactly, including uppercase and lowercase letters.
The equalsIgnoreCase() method compares two Strings without considering letter case.


*/

public class StringComparison {

    public static void main(String[] args) 
  {
         String str1 = "Java";
        String str2 = "java";

        System.out.println("String 1 = " + str1);
         System.out.println("String 2 = " + str2);
  
        System.out.println("Using equals() = " + str1.equals(str2));

         System.out.println("Using equalsIgnoreCase() = " + str1.equalsIgnoreCase(str2));

  }
}
