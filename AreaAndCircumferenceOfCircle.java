/*
Question:
Write a Java program to input the radius of a circle and calculate its area and circumference.

Concepts Covered:
- Scanner Class
- User Input
- Variables
- Arithmetic Operators (*)
- Mathematical Formula
- Method Used: nextFloat()
- Output using System.out.println()

Sample Input:
Enter the radius of the circle: 7
  
Sample Output:
Area of Circle = 153.93805
Circumference of Circle = 43.9823

Explanation:
This program takes the radius of a circle as input using the Scanner class.
It calculates the area using the formula (3.14*r*r) and the circumference using the formula (2 * 3.14 * r). 
Finally, it displays both the area and circumference result.

*/


import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args)
  {
      Scanner a = new Scanner(System.in);

        System.out.println("Enter the radius of Circle : ");
        float r = a.nextFloat();

        float area = 3.14f * r * r;
        float circumference = 2 * 3.14f * r;

        System.out.println("The Area of Circle is = " + area);
   
        System.out.println("The Circumference of Circle is = " + circumference);

    }
}
