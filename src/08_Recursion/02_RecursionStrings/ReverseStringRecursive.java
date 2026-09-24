import java.util.Scanner;

public class ReverseStringRecursive {

    public static String reverse(String str){

        if(str.length() <= 1){
            return str;
        }
        else{
            return reverse(str.substring(1)) + str.charAt(0);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Reversed String is : " + reverse(str));

        sc.close();

    }
}