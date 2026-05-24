import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "javaUser" ;
        String correctPassword = "JavaLearner@12";

        System.out.println("\n=== Login Validation ===\n");

        System.out.print("Enter Username : ");
        String username = sc.next();
        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        if(username.equals(correctUsername) )
        {
            if (password.equals(correctPassword))
            {
                System.out.println("\nLogin Successful ! Welcome : "+username);
            }

            else
            {
                System.out.println("\nLogin failed: Invalid Password");
            }

        }

        else
        {
            System.out.println("\nLogin failed: Invalid Username");
        }

        sc.close();

    }
}