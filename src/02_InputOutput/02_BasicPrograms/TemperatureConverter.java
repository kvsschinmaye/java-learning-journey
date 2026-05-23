import  java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");

        //Celsius to Fahrenheit

        System.out.print("Enter temperature in Celsius : ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5 ) * celsius+ 32;

        System.out.printf("\nTemperature in Fahrenheit : %.2f\u00B0F",fahrenheit);

        //Fahrenheit to Celsius

        System.out.print("\nEnter temperature in  Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = (5.0 / 9 ) * (fahrenheit - 32);

        System.out.printf("\nTemperature in Celsius : %.2f\u00B0C",celsius);

       sc.close();


    }
}