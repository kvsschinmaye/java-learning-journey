import java.util.Scanner;
public class BankAccountEncapsulation {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccountEncapsulation(String holder, long number, double bal) {
        if (holder == null || holder.isBlank()) {
            System.out.println("Invalid Account Holder Name");
            this.accountHolder = "Unknown";
        } else {
            this.accountHolder = holder;
        }
        if (number <= 0) {
            System.out.println("Invalid Account Number");
            this.accountNumber = 1;
        } else {
            this.accountNumber = number;
        }
        if (bal < 0) {
            System.out.println("Balance cannot be negative");
            this.balance = 0;
        } else {
            this.balance = bal;
        }
    }

    public boolean setAccountHolder(String holder) {
        if (holder == null || holder.isBlank()) {
            System.out.println("Account holder name cannot be blank.");
            return false;
        }
        this.accountHolder = holder;
        return true;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return balance;
        } else {
            balance += amount;
            System.out.println("Amount deposited successfully");
            return balance;
        }
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return balance;
        } else if (amount > balance) {
            System.out.println("Withdraw amount should not exceed the balance");
            return balance;
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
            return balance;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance Amount : " + String.format("%.2f", balance));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Details Of Account Holder 1 : ");

        System.out.print("Account Holder : ");
        String accountHolder = sc.nextLine();
        if (accountHolder == null || accountHolder.isBlank()) {
            System.out.println("Error: Account holder name cannot be blank.");
            sc.close();
            return;
        }

        System.out.print("Account Number  : ");
        long accountNumber = sc.nextLong();
        if (accountNumber <= 0) {
            System.out.println("Error: Account number must be positive.");
            sc.close();
            return;
        }

        System.out.print("Enter Balance   : ");
        double balance = sc.nextDouble();
        if (balance < 0) {
            System.out.println("Balance must be positive");
            sc.close();
            return;
        }

        BankAccountEncapsulation account1 = new BankAccountEncapsulation(accountHolder, accountNumber, balance);
        BankAccountEncapsulation account2 = new BankAccountEncapsulation("Ram", 675678902, 56290);
        BankAccountEncapsulation[] accounts = {account1, account2};

        BankAccountEncapsulation selected = account1;

        boolean running = true;

        while(running){

            System.out.println("\n=== Account menu ===\n");
            System.out.println("1.Select Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change Account Holder Name");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n=== Select Account ===");
                    for (int i = 0; i < accounts.length; i++) {
                        System.out.println((i + 1) + "." + accounts[i].getAccountHolder());
                    }
                    System.out.print("Enter your choice: ");
                    int accountChoice = sc.nextInt();
                    if (accountChoice >= 1 && accountChoice <= accounts.length) {
                        selected = accounts[accountChoice - 1];
                        System.out.println("Switched to account : " + selected.getAccountHolder());
                    } else {
                        System.out.println("Invalid account choice.");
                    }
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    selected.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Enter withdraw amount: ");
                    selected.withdraw(sc.nextDouble());
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter new account holder name: ");
                    String newName = sc.nextLine();
                    selected.setAccountHolder(newName);
                    break;

                case 5:
                    System.out.println("Account Details : ");
                    selected.displayAccountDetails();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid transaction choice");
            }

        if (running) {
            System.out.printf("%nCurrent Balance: %.2f%n", selected.getBalance());
        }
    }

        sc.close();

    }
}
