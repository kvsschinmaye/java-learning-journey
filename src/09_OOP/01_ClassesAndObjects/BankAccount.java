import java.util.Scanner;
public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

   void displayAccountDetails(){
      System.out.println("Account Holder  : " + accountHolder);
      System.out.println("Account Number  : " + accountNumber);
      System.out.println("Account balance : " + balance);
  }

   double deposit(double amount){
      if(amount <= 0){
          System.out.println("Amount must be greater than 0");
          return balance;
      }
      balance += amount;
      return  balance;
  }

   double withdraw(double amount){
      if(amount <= 0 || amount > balance){
          System.out.println("Amount must be positive and cannot exceed the available balance");
          return balance;
      }
      balance -= amount;
      return balance;
  }

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      BankAccount b1 = new BankAccount();
      b1.accountHolder = "Sri";
      b1.accountNumber = 574899221;
      b1.balance = 87240.57;

      BankAccount b2 = new BankAccount();
      b2.accountHolder = "Chinmaye";
      b2.accountNumber = 392816910;
      b2.balance = 93271.93;

      BankAccount[] accounts = {b1,b2};
      int accountChoice;

      do{
          System.out.println("=== Select Account ===");
      for(int i = 0 ; i < accounts.length ; i++){
          System.out.println((i + 1) + "." + accounts[i].accountHolder);
      }
          System.out.println((accounts.length + 1) + ".Exit");
          System.out.print("Enter your choice : ");
          accountChoice = sc.nextInt();

          if(accountChoice >= 1 && accountChoice <= accounts.length) {
              BankAccount selected = accounts[accountChoice - 1];
              int choice;
              do {
                  System.out.println("\n=== Banking Menu for " + selected.accountHolder + " ===");
                  System.out.println("1. Display Account Details");
                  System.out.println("2. Deposit");
                  System.out.println("3. Withdraw");
                  System.out.println("4. Back to Account Selection");

                  System.out.print("Enter your choice: ");
                  choice = sc.nextInt();

                  switch (choice) {

                      case 1:
                          selected.displayAccountDetails();
                          break;

                      case 2:
                          System.out.println("Enter the deposit amount : ");
                          double dp = sc.nextDouble();
                          selected.deposit(dp);
                          break;

                      case 3:
                          System.out.println("Enter the withdraw amount : ");
                          double wd = sc.nextDouble();
                          selected.withdraw(wd);
                          break;

                      case 4:
                          System.out.println("Returning to Account selection.....");
                          break;

                      default:
                          System.out.println("Invalid Choice! Enter a valid input");
                  }

              } while (choice != 4);

          }

            else if (accountChoice == accounts.length + 1) {
                  System.out.println("Exiting... Thank you!");
              }

            else {
                  System.out.println("Invalid account choice. Try again.");
              }

          } while (accountChoice != accounts.length + 1);

      sc.close();

    }
}

