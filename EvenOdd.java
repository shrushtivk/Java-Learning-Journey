/*
Question:
Write a Java program to check whether a given number is even or odd.

Concepts Covered:
- if-else statement
- Modulus Operator (%)
- int Data Type
- Variables
- System.out.println()

Sample Input:
Number = 8

Sample Output:
Number is even

Explanation:
The modulus operator (%) gives the remainder after division.
If a number divided by 2 gives a remainder of 0, the number is even.
Otherwise, the number is odd.


*/

public class EvenOdd {

    public static void main(String[] args)
  {
       int num = 8;
    
        if (num % 2 == 0) {
              System.out.println("Number is even");
        }
        else {
               System.out.println("Number is odd");
        }
  }
}
