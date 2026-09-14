import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Using Loop");
        for(int i = str.length()-1 ; i >= 0 ; i--)
        {
            System.out.print(str.charAt(i));

        }

        System.out.println();

        System.out.println("Using Swapping");
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

      String s = new String(c);
        System.out.print(s);

        sc.close();
    }
}