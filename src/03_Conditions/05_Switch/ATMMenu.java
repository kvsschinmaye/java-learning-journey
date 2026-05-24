import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 45607.00;
        System.out.println("=== ATM Menu===");
        System.out.println("1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. Exit");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                System.out.printf("Available Balance: %.2f", balance);
                break;

            case 2:

                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();

                if (deposit <= 0)
                {
                    System.out.println("Please enter valid amount");
                }

                else
                {
                    balance += deposit;
                    System.out.println("Amount deposited successfully");
                    System.out.printf("Updated Balance: %.2f",balance);
                }

                break;

            case 3:

                System.out.println("Enter withdrawal amount: ");
                double withdraw = sc.nextDouble();

                if(withdraw <= 0)
                {
                    System.out.println("Please enter valid amount");
                }

                else if( withdraw > balance)
                {
                    System.out.println("Insufficient balance");
                }

                else {
                    balance -= withdraw;
                    System.out.println("Amount withdrawn successfully");
                    System.out.printf("Remaining Balance:%.2f", balance);
                }
                break;

            case 4 :
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Enter a valid choice");

        }

        sc.close();

    }
}