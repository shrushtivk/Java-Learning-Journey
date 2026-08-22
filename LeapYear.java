/*
Question:
Write a Java program to check whether a given year is
a leap year or not.

Concepts Covered:
- if-else statement
- Logical Operators (&&, ||)
- Modulus Operator (%)
- int Data Type
- Variables
- Comparison Operators
- System.out.println()

Sample Input:
Year = 2024

Sample Output:
2024 is a leap year.

Explanation:
A year is a leap year if:
1. It is divisible by 400, OR
2. It is divisible by 4 but not divisible by 100.


*/

public class LeapYear {

    public static void main(String[] args)
  {
   int year = 2024;

         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } 
         
         else {
            System.out.println(year + " is not a leap year.");
      }
  }
}
