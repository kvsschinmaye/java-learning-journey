import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Multiplication Table ===");

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.println();

        for(int i = 1 ; i <= 20 ; i++)
        {
            System.out.printf("%d x %d = %d%n", number,i,(number * i) );

        }

        sc.close();

    }
}