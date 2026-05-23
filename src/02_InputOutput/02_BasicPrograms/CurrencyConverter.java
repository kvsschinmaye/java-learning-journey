import java.util.Scanner;

class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");

        System.out.print("Enter source currency: ");
        String fromCurrency = sc.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String toCurrency = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter the exchange rate: ");
        double rate = sc.nextDouble();

        double convertedAmount = amount * rate ;

        System.out.printf("\n%.2f %s = %.2f %s",amount,fromCurrency,convertedAmount,toCurrency );

        sc.close();

    }
}