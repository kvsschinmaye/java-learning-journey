import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();

        System.out.println("\n=== Calculator Menu ===");
        System.out.print("a)Addition\nb).Subtraction\nc)Multiplication\nd)Division\ne)Modulus");
        System.out.print("\nSelect your option(a - e): ");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case 'a':
                System.out.printf("Addition: %.2f ", num1 + num2);
                break;


            case 'b':
                System.out.printf("Subtraction : %.2f", num1 - num2);
                break;

            case 'c':
                System.out.printf("Multiplication : %.2f", num1 * num2);
                break;

            case 'd':

                if (num2 == 0) {
                    System.out.println("Division by 0 is not possible");
                } else {

                    System.out.printf("Division: %.2f", num1 / num2);
                }
                break;


            case 'e':

                if (num2 == 0) {
                    System.out.println("Modulus by 0 is not possible");
                } else {
                    System.out.printf("Modulus: %.2f", num1 % num2);
                }
                break;


            default:
                System.out.println("Enter a valid choice");


                sc.close();

        }
    }
}