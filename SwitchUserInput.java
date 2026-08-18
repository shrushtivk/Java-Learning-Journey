/*
Question:
Write a Java program to take a number from the user and display
the corresponding day of the week using the switch statement.

Concepts Covered:
- switch statement
- case
- break
- default
- Scanner Class
- User Input
- int Data Type
- nextInt() Method
- System.out.println()

Sample Input:
Enter day number:
3

Sample Output:
Wednesday

Explanation:
This program takes a number from the user using Scanner.
The switch statement checks the number and displays the
corresponding day of the week.
.

*/

import java.util.Scanner;

public class SwitchUserInput {

    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number: ");
          int day = sc.nextInt();

        switch (day)
          {
            case 1:
                System.out.println("Monday");
                 break;

             case 2:
                System.out.println("Tuesday");
                 break;

             case 3:
                 System.out.println("Wednesday");
                break;

             case 4:
                System.out.println("Thursday");
                  break;

              case 5:
                System.out.println("Friday");
                 break;

              case 6:
                System.out.println("Saturday");
                  break;

             case 7:
                System.out.println("Sunday");
                 break;

            default:
                System.out.println("Invalid day number");
      }
  }
}
