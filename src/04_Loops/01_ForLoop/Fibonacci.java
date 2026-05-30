import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Fibonacci of a Number ===");

        System.out.print("Enter number of terms : ");
        int number = sc.nextInt();

        int first = 0;
        int second = 1;
        int next;

        System.out.println("Fibonacci series : ");

        for(int  i = 0 ; i < number ; i++)
        {
            System.out.print(first +" ");
            next = first + second;
            first = second;
            second = next;
        }

        sc.close();

    }
}