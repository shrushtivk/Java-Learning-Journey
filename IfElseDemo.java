/*
Question:
Write a Java program to demonstrate the if-else statement.
Check whether a given number is positive or negative.

Concepts Covered:
- if-else statement
- int Data Type
- Variables
- Comparison Operator (>=)
- System.out.println()

Sample Input:
-5

Sample Output:
Number is negative

Explanation:
The if-else statement is used when we want to perform
one action if the condition is true and another action
if the condition is false.


*/

public class IfElseDemo {

    public static void main(String[] args)
  {
        int num = -5;

        if (num >= 0) 
        {
            System.out.println("Number is positive");
        } 
        else {
            System.out.println("Number is negative");
        }
  }
}
