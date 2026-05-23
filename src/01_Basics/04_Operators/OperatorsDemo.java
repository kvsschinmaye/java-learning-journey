public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 26;
        int b = 24;

        System.out.println("\n=== 1.Arithmetic Operations ===");
        System.out.println("\nAddition       : " +(a + b));
        System.out.println("Subtraction    : " +(a - b));
        System.out.println("Multiplication : " +(a * b));
        System.out.println("Division       : " +(a / b));
        System.out.println("Modulus        : " +(a % b));
        System.out.printf("Floating point Division : %.2f%n", (double) a / b);
        // --------------------------------------------------
        System.out.println("\n=== 2.Unary Operations ===");
        int x = 7;
        System.out.println("\nUnary Plus          : " + (+x));
        System.out.println("Unary Minus         : " + (-x));
        System.out.println("Bitwise complement  : " + (~x));
        System.out.println("\nPre-Increment       : " + (++x));
        System.out.println("Pre-Decrement       : " + (--x));
        System.out.println("\nPost-Increment      : " + (x++));
        System.out.println("After Post-Increment, x = " + x);
        System.out.println("\nPost-Decrement      : " + (x--));
        System.out.println("After Post-Decrement, x = " + x);
        // --------------------------------------------------
        System.out.println("\n=== 3.Assignment Operations ===");
        System.out.println("\nx += 5 : " + (x += 5));
        System.out.println("x -= 3 : " + (x -= 3));
        System.out.println("x *= 4 : " + (x *= 4));
        System.out.println("x /= 9 : " + (x /= 9));
        System.out.println("x %= 8 : " + (x %= 8));
        // --------------------------------------------------
        System.out.println("\n=== 4.Relational Operations ===");
        System.out.println("\na > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        // --------------------------------------------------
        System.out.println("\n=== 5.Logical Operations ===");
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("\nLogical AND : " + (condition1 && condition2));
        System.out.println("Logical OR  : " + (condition1 || condition2));
        System.out.println("Logical NOT : " + (!condition2));
        // --------------------------------------------------
        System.out.println("\n=== 6.Ternary Operation ===");
        int largest = a > b ? a : b;
        System.out.println("\nLargest Number : " + largest);
        // --------------------------------------------------
        System.out.println("\n=== 7.Bitwise Operations ===");
        System.out.println("\nBitwise AND : " + (a & b));
        System.out.println("Bitwise OR  : " + (a | b));
        System.out.println("Bitwise XOR : " + (a ^ b));
        // --------------------------------------------------
        System.out.println("\n=== 8.Shift Operators ===");
        int y = 5;
        System.out.println("\nLeft Shift  : " + (y << 3));
        System.out.println("Right Shift : " + (y >> 2));
        System.out.println("Unsigned Right Shift : " + (y >>> 4));

    }
}