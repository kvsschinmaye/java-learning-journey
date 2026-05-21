public class SwapUsingMulDiv {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        //Before Swapping
        System.out.println("=== Before Swapping ===");
        System.out.printf("a = %d , b = %d%n",a,b);

        // Swapping using Multiplication & Division
        a = a * b;
        b = a / b;
        a = a / b;

        /* Limitation:
          1. Division by zero can occur if either number becomes 0.
          2. Integer overflow may occur for very large values.
         */

        System.out.println();

        //After Swapping
        System.out.println("=== After Swapping ===");
        System.out.printf("a = %d , b = %d%n",a,b);

    }
}