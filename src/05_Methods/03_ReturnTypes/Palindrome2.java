import java.util.Scanner;

public class Palindrome2 {

    public boolean isPalindrome(int num) {
        int origNum = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
      return origNum == rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        Palindrome2 p = new Palindrome2();

        if(  p.isPalindrome(num))
        {
            System.out.printf("%d is a palindrome",num);
        }
        else {
            System.out.printf("%d is not a palindrome ", num);
        }

        sc.close();

    }
}