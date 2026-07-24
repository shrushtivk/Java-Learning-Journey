/*
Question:
Write a Java program to encrypt a grade by adding 8 to it.
Then decrypt it to display the original grade.

Concepts Covered:
- char Data Type
- Arithmetic Operators (+, -)
- Type Casting (char)
- ASCII Values
- Output using System.out.println()

Sample Output:
Original Grade = A
Encrypted Grade = I
Decrypted Grade = A

Explanation:
This program stores a grade in a character variable.
To encrypt the grade, 8 is added to its ASCII value.
The result is type cast back to a char to display the encrypted grade.
To decrypt the grade, 8 is subtracted from the encrypted grade, which gives the original grade.


*/

public class GradeEncryptDecrypt {

    public static void main(String[] args)
  {

        char grade = 'A';

        System.out.println("Original Grade = " + grade);

       
    // Encrypt
         grade = (char) (grade + 8);
        System.out.println("Encrypted Grade = " + grade);

         
     // Decrypt
        grade = (char) (grade - 8);
         System.out.println("Decrypted Grade = " + grade);

  }
}
