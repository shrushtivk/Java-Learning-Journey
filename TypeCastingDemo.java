/*
Question:
Write a Java program to demonstrate implicit and explicit type casting.

Concepts Covered:
- Variables
- int Data Type
- float Data Type
- Implicit Type Casting 
- Explicit Type Casting 
- Output using System.out.println()

Sample Output:
Implicit Type Casting:

Integer value = 10
Float value = 10.0

Explicit Type Casting:

Float value = 2.7
Integer value = 2

Explanation:
Type casting is used to convert one data type into another.

1. Implicit Type Casting:
   - Java automatically converts a smaller data type into a larger data type.
   - Example: int to float.
   - No type casting operator is required.

2. Explicit Type Casting:
   - The programmer manually converts a larger data type into a smaller data type.
   - Example: float to int.
   - The type casting operator is required.
   - When converting a float to an int, the decimal part is removed.


*/

public class TypeCastingDemo {

    public static void main(String[] args) 
  {

         System.out.println("Implicit Type Casting:\n");

         int a = 10;
         System.out.println("Integer value = " + a);
 
         float c = a;
        System.out.println("Float value = " + c);

         System.out.println("\nExplicit Type Casting:\n");

        float b = 2.7f;
        System.out.println("Float value = " + b);

        int d = (int) b;
         System.out.println("Integer value = " + d);
 
  }
}
