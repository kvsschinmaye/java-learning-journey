import java.util.Scanner;

class EvenOdd{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number % 2 == 0)
        {
            System.out.printf("%d is an Even Number",number);
        }

        if(number % 2 != 0)
        {
            System.out.printf("%d is an Odd number",number);
        }

        sc.close();
    }
}