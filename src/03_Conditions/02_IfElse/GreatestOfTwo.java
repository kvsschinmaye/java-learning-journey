import java.util.Scanner;

public class GreatestOfTwo{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.printf("%d is greater than %d",num1,num2);
        }

        else {
            if (num2 > num1) {
                System.out.printf("%d is greater than %d", num2, num1);
            } else {
                System.out.println("Both numbers are equal");
            }
        }

        sc.close();

    }
}