public class SwapUsingAddSub {

public static void main(String[] args) {
    int a = 39;
    int b = 65;

    System.out.println("=== Before Swapping ===");
    System.out.println("a = " + a +" , b = " +b);

    // Swapping using Addition & Subtraction
    a = a + b;
    b = a - b;
    a = a - b;

   /*
   Limitation:
   Integer overflow can occur if number becomes too large
   Example:
   int a = 1783108309;
   int b = 2135930213;
   */

    System.out.println();

    System.out.println("=== After Swapping ===");
    System.out.printf("a = %d , b = %d",a,b);
   }
}