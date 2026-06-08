import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        do {

            System.out.print("\n\n=== Menu Driven ===");
            System.out.print("\n1.Factorial\n2.Fibonacci\n3.Palindrome\n4.PrimeNumber\n5.exit");
            System.out.print("\nSelect your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int fact = 1;
                    System.out.print("\nEnter a number : ");
                    int num1 = sc.nextInt();
                    int i = 1;
                    while (i <= num1) {

                        fact *= i;
                        i++;

                    }
                    System.out.printf("Factorial of %d is : %d", num1, fact);
                    break;

                case 2:
                    int a = 0;
                    int b = 1;
                    int j = 0;
                    System.out.println("Enter number of terms : ");
                    int num2 = sc.nextInt();
                    while (j < num2) {
                        System.out.printf("%d\t",a);
                        int next = a + b;
                        a = b;
                        b = next;
                        j++;
                    }
                    break;

                case 3:
                    System.out.print("Enter a number : ");
                    int num3 = sc.nextInt();
                    int originalNumber = num3;
                    int reverse = 0;
                    for(; num3 != 0 ; num3 /=10 )
                    {
                        reverse = reverse * 10 + num3 % 10;
                    }
                     if(reverse == originalNumber) {
                         System.out.printf("%d is a Palindrome number ", originalNumber);
                     }
                     else {
                         System.out.printf("%d is not a Palindrome",originalNumber);
                     }

                     break;

                case 4 :
                    System.out.print("Enter a number : ");
                    int num4 = sc.nextInt();
                    int k = 2;
                    boolean isPrime = true;

                    while(k <= Math.sqrt(num4)) {

                        if (num4 % k == 0) {
                            isPrime = false;
                            break;
                        }
                        k++;
                    }
                    if(isPrime && num4 > 1)
                    {
                        System.out.printf("%d is a Prime Number",num4);
                    }
                    else{
                        System.out.printf("%d is not a Prime Number",num4);
                    }
                   break;

                case 5 :
                    System.out.println("Program is Exited");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice != 5);
    }

}