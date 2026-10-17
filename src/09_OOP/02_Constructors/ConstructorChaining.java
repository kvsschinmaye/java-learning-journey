public class ConstructorChaining {

    int num1;
    int num2;
    int sum;
    int difference;
    int product;
    double quotient;

    public ConstructorChaining(){
       this(26,18);
    }

    public ConstructorChaining(int n1){
        this(n1,12);
    }

    public ConstructorChaining(int n1, int n2){
        this.num1 = n1;
        this. num2 = n2;

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

        ConstructorChaining co1 = new ConstructorChaining(34,16);
        System.out.println("\n=== Two-Parameter Constructor ===\n");
        co1.displayDetails();

        ConstructorChaining co2 = new ConstructorChaining();
        System.out.println("\n=== Non-Parameterized Constructor ===\n");
        co2.displayDetails();

        ConstructorChaining co3 = new ConstructorChaining(19);
        System.out.println("\n=== One-Parameter Constructor ===\n");
        co3.displayDetails();

    }
}