/*
Question:
Write a Java program to perform basic arithmetic operations
using the switch statement.

Concepts Covered:
- switch statement
- Scanner Class
- User Input
- Arithmetic Operators
- case
- break
- default
- int Data Type
- nextInt() Method

Sample Input:
Enter first number: 20
Enter second number: 5
Enter operator: +

Sample Output:
Result = 25

Explanation:
The program takes two numbers and an operator from the user.
The switch statement checks the operator and performs
the corresponding arithmetic operation.


*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter first number: ");
          int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
         int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
          char operator = sc.next().charAt(0);

        switch (operator) 
        {
            case '+':
                 System.out.println("Result = " + (num1 + num2));
                  break;

             case '-':
                 System.out.println("Result = " + (num1 - num2));
                  break;
 
              case '*':
                 System.out.println("Result = " + (num1 * num2));
                  break;
 
            case '/':
                System.out.println("Result = " + (num1 / num2));
                  break;

             default:
                System.out.println("Invalid operator");

     }
   }
}
