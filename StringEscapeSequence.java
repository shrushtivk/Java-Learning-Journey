/*
Question:
Write a Java program to demonstrate escape sequences in Strings.

Concepts Covered:
- String
- Escape Sequences
- \n (New Line)
- \t (Tab)
- \" (Double Quotes)
- \\ (Backslash)
- System.out.println()

Sample Output:
Welcome to Java
Programming

Name:    Ram

Java says "Hello!"

Folder: C:\Java\Programs

Explanation:
Escape sequences are special characters that begin with a backslash (\).
They are used to format the output or print special characters.


*/

public class StringEscapeSequence {

    public static void main(String[] args) 
  {

         System.out.println("Welcome to Java\nProgramming");

         System.out.println();

         System.out.println("Name:\tRam");
  
        System.out.println();
  
         System.out.println("Java says \"Hello!\"");

         System.out.println();

          System.out.println("Folder: C:\\Java\\Programs");
  
  }
}
