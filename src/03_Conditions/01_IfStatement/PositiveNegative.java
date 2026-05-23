import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        double number = sc.nextDouble();

        if(number == 0)
        {
            System.out.println("Number is Zero ");
        }

        if (number > 0) {
            System.out.printf("%.2f is a Positive Number", number);
        }

        if (number < 0) {
            System.out.printf("%.2f is a Negative Number", number);
        }

        sc.close();
    }
}