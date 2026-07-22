/*
Question:
Write a Java program to find the value of the following expression and display the result.

Expression:
int y = 7;
int x = ++y * 8;

Concepts Covered:
- Variables
- int Data Type
- Pre-Increment Operator (++)
- Arithmetic Operator (*)
- Expression Evaluation
- Output using System.out.println()

Sample Output:
Value of x = 64
Value of y = 8

Explanation:
The pre-increment operator (++) increases the value of y before it is used in the expression.
Initially, y = 7.
After ++y, the value becomes 8.
Then program calculates:
8 * 8 = 64
So,
x = 64 and 
y = 8.


*/

public class IncrementOperatorDemo {

    public static void main(String[] args) 
  {

        int y = 7;

         int x = ++y * 8;
  
         System.out.println("Value of x = " + x);
          System.out.println("Value of y = " + y);

  }
}
