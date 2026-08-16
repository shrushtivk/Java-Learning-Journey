/*
Question:
Write a Java program to demonstrate the else-if statement
and display the grade based on marks.

Concepts Covered:
- else-if statement
- int Data Type
- Variables
- Comparison Operators
- System.out.println()

Sample Input:
Marks = 85

Sample Output:
Grade A

Explanation:
The else-if statement is used to check multiple conditions.
The program checks the marks and displays the appropriate grade.


*/

public class ElseIfDemo {

    public static void main(String[] args)
  {
       int marks = 85;

        if (marks >= 90) {
             System.out.println("Grade A+");
        } 
         else if (marks >= 75) {
              System.out.println("Grade A");
        } 
          else if (marks >= 60) {
              System.out.println("Grade B");
        }
         else if (marks >= 40) {
              System.out.println("Grade C");
        }
      else {
              System.out.println("Fail");
      }
 }
}
