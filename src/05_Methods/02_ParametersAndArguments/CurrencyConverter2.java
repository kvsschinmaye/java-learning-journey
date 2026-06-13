import java.util.Scanner;

public class CurrencyConverter2 {

    public static double convertCurrency(double amount, double rate)
    {
        return amount * rate ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source currency : ");
        String source = sc.next().toUpperCase();

        System.out.print("Enter target currency : ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter the amount to convert : ");
        double amount = sc.nextDouble();

        System.out.print("Enter the exchange rate : ");
        double rate = sc.nextDouble();

        double converted =  convertCurrency(amount , rate);

        System.out.println("\n==== Currency Conversion Result ===");
        System.out.printf("%n %.2f %s = %.2f %s %n " , amount , source , converted , target);

        sc.close();
    }
}