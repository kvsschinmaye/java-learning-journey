import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Factorial of a Number ===");

        System.out.print("Enter a number (0 - 20): ");
        long number = sc.nextLong();

        long factorial = 1;

        if(number < 0 )
        {
            System.out.println("Factorial is not defined for negative numbers ");
        }

        else {

            for (long i = number; i >= 1; i--) {
                factorial *= i;
            }

            System.out.printf("Factorial of %d is : %d%n", number, factorial);
        }

        sc.close();

    }
}