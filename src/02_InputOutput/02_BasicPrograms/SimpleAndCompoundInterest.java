import java.util.Scanner;

public class SimpleAndCompoundInterest
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount : ");
        double principalAmount = sc.nextDouble();

        System.out.println("Enter Rate Of Interest : ");
        double rateOfInterest = sc.nextDouble();

        System.out.println("Enter period of time(in years) : ");
        int time = sc.nextInt();

        double simpleInterest = (principalAmount * rateOfInterest * time) / 100;

        System.out.println("Enter the number of times interest is compounded in a year: ");
        int n = sc.nextInt();

        double amount = principalAmount * Math.pow(1 + (rateOfInterest / 100.0) / n , n * time);

        double compoundInterest = amount - principalAmount;

        System.out.println("=== Results ===");

        System.out.printf("Simple Interest   : %.2f",simpleInterest);
        System.out.printf("\nTotal Amount(SI)   : %.2f ",(simpleInterest + principalAmount));
        System.out.printf("\n\nCompound Interest : %.2f",compoundInterest);

        sc.close();
    }
}