import java.util.Scanner;

public class PowerOfNumber {

    public static long power(long base, long exp){
        if(exp == 0){
            return 1;
        }
        else {
            return base * power(base, exp - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base number : ");
        long base = sc.nextLong();

        System.out.println("Enter the exponent : ");
        long exp = sc.nextLong();

        if (exp < 0) {
            System.out.println("Exponent must be non-negative.");
            sc.close();
            return;
        }

        System.out.printf("Power of (%d,%d) is %d",base,exp,power(base,exp));

        sc.close();

    }
}