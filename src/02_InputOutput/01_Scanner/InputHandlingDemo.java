import java.util.Scanner;

public class InputHandlingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter a String value:");
        String name = sc.nextLine();

        System.out.println("Enter Branch :");
        String branch = sc.next();

        System.out.println("Enter a double value:");
        double salary = sc.nextDouble();

        System.out.println("Enter a float value:");
        float marks = sc.nextFloat();

        System.out.println("Enter a character Value:");
        char section = sc.next().charAt(0);

        System.out.println("=== Entered details ===");
        System.out.println("\nInteger : " +number+
                           "\t\nString  : " +name+
                           "\t\nBranch  : " +branch+
                           "\t\nDouble  : " +salary+
                           "\t\nFloat   : " +marks+
                           "\t\nChar    : " +section);

        sc.close();

    }
}