import java.util.Scanner;

public class VoteEligibility {

        public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

            System.out.println("Enter the age: ");
            int age = sc.nextInt();

            if(age >= 18)
            {
                System.out.println("You are Eligible to Vote");
                return;
            }

            System.out.println("You are not Eligible to Vote");

            sc.close();
    }
}