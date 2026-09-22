import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        int[] freq = new int[Character.MAX_VALUE + 1];

        for(int i = 0 ; i < str.length() ; i++){
            freq[str.charAt(i)]++;
        }

        char result = '\0';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1 && !Character.isWhitespace(str.charAt(i))) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First Non-Repeated Character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }

        sc.close();

    }
}