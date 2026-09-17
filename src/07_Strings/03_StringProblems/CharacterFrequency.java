import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        int[] frequency = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < str.length(); i++) {

            frequency[str.charAt(i)]++;
        }

        System.out.println("\nCharacter Frequencies:");

            for(int i = 0 ; i < frequency.length ; i++) {

                if(frequency[i] > 0)
                    System.out.println((char) i + " " + frequency[i]);

           }

            sc.close();
    }

}