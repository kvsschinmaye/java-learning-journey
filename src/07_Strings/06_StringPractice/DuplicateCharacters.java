import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        int[] freq = new int[Character.MAX_VALUE + 1];

        for(int i = 0 ; i < str.length() ; i++){
              freq[str.charAt(i)]++;
        }

        System.out.println("Duplicate Characters");

        for(int i = 0 ; i < Character.MAX_VALUE + 1 ; i++){
            if(freq[i] > 1 && !Character.isWhitespace((char) i)) {
                System.out.println((char) i + " " +freq[i]);
            }
        }

        sc.close();
    }
}