import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sum of N Numbers ===");

        System.out.println("How many numbers do you want to add ? ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1 ; i <= n ; i++ )
        {
            System.out.print("Enter number " + i + " : ");
            int number = sc.nextInt();
             sum += number;
        }

        System.out.println("\nSum of " + n + " numbers is : " +sum);

        sc.close();

    }
}