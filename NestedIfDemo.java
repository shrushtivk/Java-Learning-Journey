/*
Question:
Write a Java program to demonstrate a nested if statement.
Check whether a person is eligible to vote based on their age and citizenship.

Concepts Covered:
- Nested if statement
- int Data Type
- boolean Data Type
- Variables
- Comparison Operator (>=)
- System.out.println()

Sample Output:
Age = 20
Citizen = true

You are eligible to vote.

Explanation:
A nested if means using one if statement inside another if statement.
The inner if is checked only when the outer if condition is true.


*/

public class NestedIfDemo {

    public static void main(String[] args)
  {
        int age = 20;
         boolean citizen = true;
 
        if (age >= 18)  {

            if (citizen)  {
                System.out.println("You are eligible to vote.");
          }
    }
  }
}
