import java.util.Scanner;

public class CharacterAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine().toUpperCase();

        char[] ch = str.toCharArray();

        int digit = 0, letter = 0, space = 0, other = 0, vowel = 0, consonant = 0;

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(Character.isDigit(ch[i])){
                 digit++;
            }
            else if(Character.isLetter(ch[i])){
                if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' ||ch[i] == 'O' ||ch[i] ==  'U'){
                    vowel++;
                }
                else{
                    consonant++;
                }
                letter++;
            }
            else if(Character.isWhitespace(ch[i])) {
                space++;
            }
             else
                 other++;
        }

        System.out.println("\n=== Character Analysis ===\n");
        System.out.println(str);
        System.out.println("\nNumber of Digits: " +digit);
        System.out.println("Number of Letters: " +letter);
        System.out.println("Number of Vowels: " +vowel);
        System.out.println("Number of consonants: " +consonant);
        System.out.println("Number of Spaces: " +space);
        System.out.println("Number of other Characters: " +other);

        sc.close();
    }
}