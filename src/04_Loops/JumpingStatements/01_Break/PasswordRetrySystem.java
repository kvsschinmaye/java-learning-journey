import java.util.Scanner;

public class PasswordRetrySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String originalUserName = "JavaLearner";
        String originalPassword = "Java@12Programmer";

        boolean success = false;

        for(int attempts = 1 ; attempts <= 3 ; attempts++) {

            System.out.print("\nEnter the Username : ");
            String userName = sc.next();

            System.out.print("\nEnter the Password : ");
            String password = sc.next();

            if (!userName.equals(originalUserName)) {
                System.out.println("Invalid Username");
            }
            else if (!password.equals(originalPassword)) {
                System.out.println("Invalid Password");
            }
            else {
                System.out.println("\nLogin Successful 🎉");
                success = true;
                break;
            }

            if (!success & attempts < 3) {
                System.out.println("Attempts left : " + (3 - attempts));
            }
        }
            if (!success) {
                System.out.println("Too many failed attempts , Access Denied");
            }

        sc.close();
    }
}