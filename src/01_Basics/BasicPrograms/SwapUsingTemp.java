public class SwapUsingTemp {

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int temp ;

        System.out.println("=== Before Swapping ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Swapping using temporary variable
        temp = a;
        a = b;
        b = temp;

        System.out.println("=== After Swapping ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}