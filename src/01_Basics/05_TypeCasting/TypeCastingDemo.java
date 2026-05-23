
public class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int num1 = 107;
        double value1 = num1;

        System.out.println("Implicit Type Casting");
        System.out.println("Integer Value : " + num1);
        System.out.println("Double Value  : " + value1);

        // Explicit Type Casting (Narrowing)
         double num2 = 206;
         int value2 = (int) num2;

        System.out.println("\nExplicit Type Casting");
        System.out.println("Double Value : " + num2);
        System.out.println("Integer Value: " + value2);

    }
}



