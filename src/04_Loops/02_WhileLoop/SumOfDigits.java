import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while(number != 0)
        {
             sum += number %10;
             number /= 10;
        }
        System.out.printf("Sum Of Digits in %d is : %d",originalNumber,sum);

        sc.close();
    }
}