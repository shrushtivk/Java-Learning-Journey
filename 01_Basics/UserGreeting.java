/*
Question:
Write a Java program to take the user's name as input and display a personalized greeting message.

Concepts Covered:
- Scanner Class
- User Input
- String
- Variables
- Method used : nextLine()
- Output using System.out.println()

Sample Input:
Sita

Sample Output:
Hello, Sita! Welcome to Java Programming.

Explanation:
This program takes the user's name as input using the Scanner class and stores it in a String variable. 
It then displays a personalized greeting message by combining the text with the user's name.

*/

import java.util.Scanner;
public class UserGreeting{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner (System.in);
		
		System.out.println("Enter your name : ");
		String  str = x.nextLine();
		
		System.out.println("Hello, " + str + "! Welcome to Java Programming.");
	}
}




