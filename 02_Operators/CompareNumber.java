/*
Question:
Write a Java program to take an integer input from the user and check whether it is greater than the number 8.
Display the (Boolean) result as true or false.

Concepts Covered:
- Scanner Class
- User Input
- Variables
- int Data Type
- boolean Data Type
- Relational Operator (>) (greater than)
- Method Used: nextInt()
- Output using System.out.println()

Sample Input:
Enter a number:
10

Sample Output:
Is the number greater than 8? true

Sample Input:
Enter a number:
5

Sample Output:
Is the number greater than 8? false

Explanation:
This program takes an integer input from the user using the Scanner class. It compares the entered number with 8
using thegreater than (>) operator. The result of the comparison is stored in a boolean variable.


*/

import java.util.Scanner;

public class CompareNumber{

    public static void main(String[] args) 
  {

         int z = 8;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = a.nextInt();

        boolean result = num > z;

        System.out.println("Is the number greater than 8? " + result);

   
     }
}
