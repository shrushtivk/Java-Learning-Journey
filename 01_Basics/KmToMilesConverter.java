/*
Question:
Write a Java program to input a distance in kilometers from the user and convert it into miles.
Then display the converted distance in miles.

Concepts Covered:
- Scanner Class
- User Input
- Variables
- float Data Type
- Arithmetic Operator (*)
- Unit Conversion
- Method used: nextFloat()
- Output using: System.out.println()

Sample Input:
Enter Kilometer distance: 10

Sample Output:
10.0 km = 6.2 miles

Explanation:
This program takes the distance in km as input using the Scanner class.
It converts the distance into miles using the conversion factor which is 
(1 km = 0.62miles) and displays the converted distance.

*/



import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) 
  {

         Scanner a = new Scanner(System.in);

        System.out.println("Enter Kilometer (km) distance:");
        float km = a.nextFloat();

        float miles = km * 0.62f;

         System.out.println(km + " km= " + miles + " miles");

    }
}
