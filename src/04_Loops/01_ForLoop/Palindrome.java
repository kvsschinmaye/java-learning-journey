import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Number ===");
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int originalNumber = number;
        int reverse = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;

        }
        if (reverse == originalNumber) {
            System.out.printf("%d is a palindrome number%n", originalNumber);
        } else {
            System.out.printf("%d is not a palindrome number", originalNumber);
        }

        sc.close();

    }
}