import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String 1 : ");
        String str1 = sc.nextLine();

        System.out.println("Enter the String 2 :");
        String str2 = sc.nextLine();

        int[] frequency = new int[256];

        if(str1.length() != str2.length()) {
           System.out.println("The Strings are not Anagram");
           sc.close();
           return;
       }

       for(int i = 0 ; i < str1.length() ; i++) {
           frequency[str1.charAt(i)]++;
           frequency[str2.charAt(i)]--;
       }

        boolean isAnagram = true;

       for(int i = 0 ; i < frequency.length ; i++) {
           if (frequency[i] != 0) {
               isAnagram = false;
               break;
           }
       }

           if(isAnagram){
               System.out.println("Both strings are Anagrams");
           }

           else{
               System.out.println("Both strings are not Anagrams");
           }

       sc.close();

    }
}
