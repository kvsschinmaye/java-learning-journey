import java.util.Scanner;

public class StringComparisonDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String A : ");
        String str1 = sc.nextLine();

        System.out.println("Enter String B : ");
        String str2 = sc.nextLine();

        System.out.println("Using equals() : " +str1.equals(str2));
        System.out.println("Using equalsIgnoreCase() : " +str1.equalsIgnoreCase(str2));

        int res = str1.compareTo(str2);
        System.out.println("Using compareTo() : " +res);

        if(res == 0) {
            System.out.println("Both strings are equal");
        }
        else if(res > 0) {
            System.out.println("String 1 is greater than String 2");
        }
        else {
            System.out.println("String 1 is less than String 2");
        }

        System.out.println("Using '==' operator : " +(str1 == str2));

        sc.close();
    }
}