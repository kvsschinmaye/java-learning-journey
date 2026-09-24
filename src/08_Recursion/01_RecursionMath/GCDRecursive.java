import java.util.Scanner;

public class GCDRecursive {

    public static int gcd(int num1 , int num2){
        if(num2 == 0){
            return num1;
        }
            return gcd(num2 , num1 % num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        System.out.printf("gcd of (%d,%d) is : %d",num1,num2,gcd(num1,num2));

        sc.close();

    }
}