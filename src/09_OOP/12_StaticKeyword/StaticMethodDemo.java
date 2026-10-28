class Calculator1 {
    static int add(int a , int b) {
        return a + b;
    }
    static int sub(int a , int b) {
        return a - b;
    }
    static int multiply(int a , int b) {
        return a * b;
    }
}

// StaticMethodDemo Program

public class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println("\nSum        : " + Calculator1.add(32,84));
        System.out.println("Product    : " + Calculator1.multiply(12,23));
        System.out.println("Difference : " + Calculator1.sub(54,32));
    }
}