/*
Question:
Write a Java program to check whether a given number is
positive, negative, or zero.

Concepts Covered:
- if-else-if statement
- int Data Type
- Variables
- Comparison Operators
- System.out.println()

Sample Input:
Number = -5

Sample Output:
Number is negative

Explanation:
The program checks the number using multiple conditions.
If the number is greater than 0, it is positive.
If the number is less than 0, it is negative.
Otherwise, the number is zero.


*/

public class PositiveNegativeZero {

    public static void main(String[] args) 
  {
        int num = -5;

          if (num > 0) {
            System.out.println("Number is positive");
        } 
          else if (num < 0) {
            System.out.println("Number is negative");
        } 
           else {
              System.out.println("Number is zero");
      }
  }
}
