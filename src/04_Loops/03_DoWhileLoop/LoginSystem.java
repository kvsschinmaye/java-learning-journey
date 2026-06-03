import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String originalUsername = "JavaLearner";
        String originalPassword = "JavaCoding";

        int attempts = 0;
        boolean success = false;

        do
            {
                System.out.print("Enter username: ");
                String username = sc.next();

                System.out.print("Enter password: ");
                String password = sc.next();

                if(!username.equals(originalUsername)) {
                 System.out.println("Incorrect username");
                    attempts++;
             }
                else if(!password.equals(originalPassword)) {
                 System.out.println("Incorrect password");
                    attempts++;
             }
                else {
                    System.out.println("Login successful 🎉");
                    success = true;
                }

        }while(!success && attempts < 3);

        if(!success)
        {
            System.out.println("Too many failed attempts . Access Denied 🚫");
        }

        sc.close();
    }
}
