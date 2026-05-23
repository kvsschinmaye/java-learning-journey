import java.util.Scanner;

public class DivisibilityCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number    : ");
        int number = sc.nextInt();

        System.out.println("Enter the Divisor : ");
        int divisor = sc.nextInt();

        int remainder = number % divisor;

        if(remainder == 0 )
        {
            System.out.printf("%d is divisible by %d",number,divisor);
        }

            else
            {
                System.out.printf("%d is not divisible by %d",number,divisor);
            }

            sc.close();
    }
}