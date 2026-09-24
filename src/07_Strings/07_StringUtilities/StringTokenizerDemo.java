import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a string: ");
        String str = sc.nextLine();

        // StringTokenizer is an older/legacy utility

        StringTokenizer st = new StringTokenizer(str, ",");
        StringTokenizer st1 = new StringTokenizer(str);

        System.out.println("\nComma-separated tokens:\n");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken().trim());
        }

        System.out.println();

        System.out.println("\nWhitespace-separated tokens:\n");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken().trim());
        }

        sc.close();

    }
}