import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int num){

        if(num <= 1) {
            return false;
        }

        for(int i = 2 ; i <= (int)Math.sqrt(num) ; i++) {
            if (num % i == 0) {
               return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(isPrime(num)) {
            System.out.printf("%n%d is a prime number",num);
        }

        else {
            System.out.printf("%n%d is not a prime number",num);
        }

        sc.close();

    }
}
