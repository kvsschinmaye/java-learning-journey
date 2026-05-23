import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the person : ");
        String name = sc.nextLine();

        System.out.printf("Enter the age of %s : ",name);
        int age = sc.nextInt();

        if(age < 18){
            System.out.printf("%s is not Eligible to Vote",name);
        }

        if(age >= 18){
            System.out.printf("%s is Eligible to Vote",name);
        }

        sc.close();
    }
}