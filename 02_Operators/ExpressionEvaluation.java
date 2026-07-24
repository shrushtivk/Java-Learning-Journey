/*
Question:
Write a Java program to evaluate the given expression and display the result.

Expression:

float a = 7 / 4 * 9 / 2;

Then evaluate the same expression using floating-point numbers and compare both results.

Concepts Covered:
- Variables
- float Data Type
- Arithmetic Operators (*, /)
- Integer Division
- Floating-Point Division
- Output using System.out.println()

Sample Output:
Using integer division:
a = 4.0   // because we used float a = (expression)

Using floating-point division:
b = 7.875

Explanation:
In the first expression, all the numbers are integers, so Java performs integer division and removes the decimal part before storing the result in a float.

In the second expression, 4.0f and 2.0f are float values. Since a float is present, Java performs floating-point division and keeps the decimal values,
giving a more accurate result.


*/



public class ExpressionEvaluation {

    public static void main(String[] args)
  {

        float a = 7 / 4 * 9 / 2;

         float b = 7 / 4.0f * 9 / 2.0f;

        System.out.println("Using integer division:");
        System.out.println("a = " + a);

        System.out.println();
  
         System.out.println("Using floating-point division:");
        System.out.println("b = " + b);

  }
}
  
