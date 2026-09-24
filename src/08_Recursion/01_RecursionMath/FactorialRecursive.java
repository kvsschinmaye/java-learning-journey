import java.util.Scanner;

public class FactorialRecursive {

    static long factorial(long num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a non-negative number (up to 20): ");
        long num = sc.nextLong();

        if(num < 0){
            System.out.println("Factorial is not defined for negative numbers");
            sc.close();
            return;
        }

        System.out.println("Factorial of " + num + " is : " +factorial(num));

        sc.close();

    }
}