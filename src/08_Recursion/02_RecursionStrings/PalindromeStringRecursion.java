import java.util.Scanner;

public class PalindromeStringRecursion {

    public static boolean isPalindrome(String str, int left , int right){
       if(left >= right)
           return true;
       if (str.charAt(left) != str.charAt(right))
           return false;

       return isPalindrome(str,left+1,right-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the String : ");
        String str = sc.nextLine();

        if(isPalindrome(str,0,str.length()-1)) {
            System.out.println("The string is a Palindrome");
        }
        else{
            System.out.println("The String is not a Palindrome");
        }

        sc.close();

    }
}