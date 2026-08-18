/*
Question:
Write a Java program to find the greater of two numbers
using the ternary operator.

Concepts Covered:
- Ternary Operator
- int Data Type
- Variables
- Comparison Operator (>)
- System.out.println()

Sample Input:
num1 = 20
num2 = 15

Sample Output:
Greater number = 20

Explanation:
The ternary operator is a short way of writing a simple if-else condition.
It has three parts:
condition ? value_if_true : value_if_false


*/

public class TernaryOperatorDemo {

    public static void main(String[] args) 
  {

      int num1 = 20;
        int num2 = 15;

         int greater = (num1 > num2) ? num1 : num2;
 
          System.out.println("Greater number = " + greater);
    }
}
