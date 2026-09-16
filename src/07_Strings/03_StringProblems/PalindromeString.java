import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the String : ");
        String str = sc.nextLine();

        String originalString = str;

        char[] c = str.toCharArray();

        int i = 0;
        int j = c.length - 1;

        while(i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;
        }

        String reversedManual = new String(c);
        String reversedBuiltIn = new StringBuilder(str).reverse().toString();

        boolean palindromeManual = originalString.equals(reversedManual);
        boolean palindromeBuiltIn = originalString.equals(reversedBuiltIn);

        System.out.println("\n=== Using Manual Logic ===");
        System.out.println(palindromeManual ? "Palindrome" : "Not a Palindrome");

        System.out.println("\n=== Using StringBuilder ===");
        System.out.println(palindromeBuiltIn ? "Palindrome" : "Not a Palindrome");

        sc.close();

    }
}