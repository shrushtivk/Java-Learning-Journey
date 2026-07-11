/*
Question:
Write a Java program to input two numbers from the user and display their addition, subtraction, multiplication, and division.

Concepts Covered:
- Scanner Class
- User Input
- Variables
- Arithmetic Operators (+, -, *, /)
- Method Used: nextInt()
- Output using System.out.println()

Sample Input:
Enter first number:
20

Enter second number:
10

Sample Output:
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2

Explanation:
This program takes two numbers as input from the user using the Scanner class.
It performs the four basic arithmetic operations (addition, subtraction, multiplication, and division) and displays the results.

*/


import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) 
  {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = x.nextInt();

        System.out.println("Enter number 2:");
        int num2 = x.nextInt();

        int add = (num1 + num2);
        int sub = (num1 - num2);
        int mul = (num1 * num2);
        int div = (num1 / num2);

        System.out.println("Addition : " + add);
        System.out.println("Subtraction : " + sub);
        System.out.println("Multiplication : " + mul);
        System.out.println("Division : " + div);

    }
}
