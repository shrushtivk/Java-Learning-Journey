/* Write a Java program to input two numbers from the user and display their sum result. 

Concepts Covered:
-Scanner Class
-User Input
-Variables
-Arithmetic Operator (+)
-Output using System.out.println()

Sample Output:
Enter number 1: 
15 // input
Enter number 2:
25 // input
Sum of two numbers is = 40 //output 

-Explanation:
This program takes two integer values as input from the user using the Scanner class.
It adds the two numbers using the + (sum) operator and displays the sum on the screen.

*/



import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args)
  {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int a = x.nextInt();

        System.out.println("Enter number 2:");
        int b = x.nextInt();

        int sum = (a + b);

        System.out.println("Sum of two numbers is = " + sum);
    }
}

