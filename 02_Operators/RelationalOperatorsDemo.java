/*
Question:
Write a Java program to demonstrate the relational operators in Java.

Concepts Covered:
- Scanner Class
- User Input
- Variables
- int Data Type
- boolean Data Type
- Relational Operators (>, <, >=, <=, ==, !=)
- Method Used: nextInt()
- Output using System.out.println()

Sample Input:
Enter number 1:
20

Enter number 2:
10

Sample Output:
20 > 10 = true
20 < 10 = false
20 >= 10 = true
20 <= 10 = false
20 == 10 = false
20 != 10 = true

Explanation:
This program takes two integer values as input from the user using the Scanner class.
It compares the two numbers using different relational operators.
The result of each comparison is stored in boolean variables and displayed on the screen.


*/

import java.util.Scanner;

 public class RelationalOperatorsDemo {

    public static void main(String[] args)
   {

         Scanner x = new Scanner(System.in);

         System.out.println("Enter number 1:");
          int num1 = x.nextInt();
  
         System.out.println("Enter number 2:");
          int num2 = x.nextInt();

        boolean a = (num1 > num2);
        boolean b = (num1 < num2);
        boolean c = (num1 >= num2);
        boolean d = (num1 <= num2);
        boolean e = (num1 == num2);
        boolean f = (num1 != num2);

        System.out.println(num1 + " > " + num2 + " = " + a);
        System.out.println(num1 + " < " + num2 + " = " + b);
        System.out.println(num1 + " >= " + num2 + " = " + c);
        System.out.println(num1 + " <= " + num2 + " = " + d);
        System.out.println(num1 + " == " + num2 + " = " + e);
        System.out.println(num1 + " != " + num2 + " = " + f);

  }
}
