public class ConstructorOverloading {

    int num1;
    int num2;
    int sum;
    int difference;
    int product;
    double quotient;

    public ConstructorOverloading(){
       num1 = 26;
       num2 = 14;

       sum = num1 + num2;
       difference = num1 - num2;
       product = num1 * num2;
       quotient = (double) num1 / num2;
    }

    public ConstructorOverloading(int n1, int n2){
       num1 = n1;
       num2 = n2;

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = (double) num1 / num2;
    }

    void displayDetails(){
        System.out.println("Numbers        : " + num1 + "," + num2);
        System.out.println("Addition       : " + sum);
        System.out.println("Subtraction    : " + difference);
        System.out.println("Multiplication : " + product);
        System.out.printf("Division       : %.2f%n" , quotient);
    }

    public static void main(String[] args) {

        ConstructorOverloading co1 = new ConstructorOverloading(34,16);
        System.out.println("\n=== Details of Parameterized Constructor ===\n");
        co1.displayDetails();

        ConstructorOverloading co2 = new ConstructorOverloading();
        System.out.println("\n\n=== Details of Non-Parameterized Constructor ===\n");
        co2.displayDetails();

    }
}