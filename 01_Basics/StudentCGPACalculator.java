/*
Question:
Write a Java program to input marks of five subjects from the user (out of 100), 
calculate the percentage, and then calculate the CGPA by dividing the percentage by (9.5).
Finally, display both the percentage and the CGPA.

Concepts Covered:
- Scanner Class
- User Input
- Variables
- int Data Type
- float Data Type
- Arithmetic Operators   (+,/)
- Method Used: nextInt()
- Output using System.out.println()

Sample Input:
Enter marks for Subject 1 out of 100:
85

Enter marks for Subject 2 out of 100:
90

Enter marks for Subject 3 out of 100:
80

Enter marks for Subject 4 out of 100:
88

Enter marks for Subject 5 out of 100:
92

Sample Output:
Percentage = 87.0%
CGPA = 9.157895

Explanation:
This program takes marks of five subjects from the user using the Scanner class.
It calculates the percentage %by finding the average of the five subjects. 
The CGPA is then calculated by dividing the percentage by (9.5f). 
Here, (9.5f) is used to convert the percentage into CGPA.


*/

import java.util.Scanner;

public class StudentCGPACalculator {
    public static void main(String[] args)
  
  {
     Scanner a = new Scanner(System.in);
    
        System.out.println("Enter marks for Subject 1 out of 100:");
        int sub1 = a.nextInt();

        System.out.println("Enter marks for Subject 2 out of 100:");
        int sub2 = a.nextInt();

        System.out.println("Enter marks for Subject 3 out of 100:");
        int sub3 = a.nextInt();

        System.out.println("Enter marks for Subject 4 out of 100:");
        int sub4 = a.nextInt();

        System.out.println("Enter marks for Subject 5 out of 100:");
        int sub5 = a.nextInt();

        
      float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0f;

        float cgpa = percentage / 9.5f;

        System.out.println("Percentage = " + percentage + "%");
        System.out.println("CGPA = " + cgpa);

    }
}
