/*
Question:
Write a Java program to input two numbers from the user and swap their values using a third (temporary) variable. 
Then display the values before and after swapping.

Concepts Covered:
- Scanner Class
- User Input
- Variables
- Temporary Variable
- Swapping Logic
- Method Used: nextInt()
- Output using System.out.println()

Sample Input:
Enter number 1:
10

Enter number 2:
20

Sample Output:
Before Swapping:
Number 1 = 10 and Number 2 = 20

After Swapping:
Number 1 = 20 and Number 2 = 10

Explanation:
This program takes two integer values as input from the user. 
It uses a temporary variable  (temp)to swap their values and then displays the numbers before and after swapping .


*/



import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) 
  {

        Scanner a = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = a.nextInt();

        System.out.println("Enter number 2:");
        int num2 = a.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("Number 1 = " + num1 + " and Number 2 = " + num2);

        int temp;

        temp = num1;
        num1 = num2;
         num2 = temp;

         System.out.println("After Swapping:");
         System.out.println("Number 1 = " + num1 + " and Number 2 = " + num2);

    }
}
