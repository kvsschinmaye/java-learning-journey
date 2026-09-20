import java.util.Scanner;

public class WordOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("Number of words: " +words.length);
        String longest = words[0];
        String shortest = words[0];

        for(String word : words){
            if(word.length() > longest.length()) {
                longest = word;
            }
            if(word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Longest word: " +longest);
        System.out.println("Shortest word: " +shortest);

        sc.close();
    }
}