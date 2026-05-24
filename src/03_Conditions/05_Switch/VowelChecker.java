import java.util.Scanner;

public class VowelChecker{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Vowel Checker ===");
        System.out.println("Enter a character : ");

        char ch = Character.toLowerCase(sc.next().charAt(0));

        switch(ch)
        {
            case 'a','e','i','o','u': // Available in Java 14+ versions


                System.out.printf("%c is a vowel", ch);
                break;

            default:

                if(ch >= 'a' && ch <= 'z')
                {
                    System.out.printf("%c is a consonant", ch);
                }
                else{
                    System.out.printf("'%c' is not an alphabet", ch);
                }
        }

        sc.close();

    }
}