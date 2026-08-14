/*
Question:
Write a Java program to take a number from the user and check
whether it is greater than 10 or not using if-else.

Concepts Covered:
- if-else statement
- Scanner Class
- User Input
- int Data Type
- Comparison Operator (>)
- nextInt() Method
- System.out.println()

Sample Input:
Enter a number:
15

Sample Output:
Number is greater than 10

Explanation:
This program takes a number from the user using Scanner.
The if-else statement checks whether the number is greater than 10.


*/

import java.util.Scanner;

public class UserInputIfElse {

    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
          int num = sc.nextInt();
 
        if (num > 10) 
        {
            System.out.println("Number is greater than 10");
       } 
        else{
              System.out.println("Number is not greater than 10");
       }
  }
}
