/*
Question:
Write a Java program to demonstrate the switch statement
and display the day of the week based on a number.

Concepts Covered:
- switch statement
- case
- break
- default
- int Data Type
- Variables
- System.out.println()

Sample Input:
Day = 3

Sample Output:
Wednesday

Explanation:
The switch statement is used to choose one option from
multiple cases.
The break statement stops the execution after a matching case.
The default case runs when no case matches the given value.


*/

public class SwitchDemo {

    public static void main(String[] args)
  {
        int day = 3;

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
                System.out.println("Invalid day");

        }
    }
}
