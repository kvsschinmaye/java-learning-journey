import java.util.Arrays;

public class BuiltInMethodsDemo {
    public static void main(String[] args) {


        System.out.println("\n=== String Class Methods ===\n");

        String str = " Welcome to Java !";

        System.out.println("String : '" + str +"'");
        System.out.println("Length : " + str.length());
        System.out.println("LowerCase : " + str.toLowerCase());
        System.out.println("UpperCase : " + str.toUpperCase());
        System.out.println("Trim : '" + str.trim() + "'");
        System.out.println("Concat : " + str.concat(" Mate"));
        System.out.println("Contains 'Java' ? " + str.contains("Java"));
        System.out.println("Char at index 3 : " + str.charAt(3));
        System.out.println("Substring(6,11) : " + str.substring(6,11));
        System.out.println("String after Replace : " + str.replace("Java", "Python"));
        System.out.println("StartsWith 'Welcome' ? " + str.trim().startsWith("Welcome"));


        System.out.println("\n=== Math Class Methods ===\n");

        System.out.println("Absolute value : " + Math.abs(-18));
        System.out.println("Maximum : " + Math.max(34,-67));
        System.out.println("Minimum : " + Math.min(-56,89));
        System.out.println("Square root of 27 : " + Math.sqrt(27));
        System.out.println("Random value : " + Math.random());
        System.out.println("Round value of 5.3882 : " + Math.round(5.3882));
        System.out.println("Floor of 6.57 : " + Math.floor(6.57));
        System.out.println("Ceil of 6.57 : " + Math.ceil(6.57));
        System.out.println("4 Power 5 : " + Math.pow(4,5));


        System.out.println("\n=== Character Class Methods ===\n");

        char ch = 'C';
        char digit = '8';

        System.out.println("isLetter : " + Character.isLetter(ch));
        System.out.println("isDigit (C) : " + Character.isDigit(ch));
        System.out.println("isDigit (8) : " + Character.isDigit(digit));
        System.out.println("Numeric Value (digit) : " + Character.getNumericValue(digit));
        System.out.println("Numeric Value (C) : " + Character.getNumericValue(ch));
        System.out.println("To LowerCase (C) : " + Character.toLowerCase(ch));
        System.out.println("To UpperCase (a) : " + Character.toUpperCase('a'));


        System.out.println("\n=== Arrays Class Methods ===\n");

        int[] arr = {45,23,86,67};

        Arrays.sort(arr);
        System.out.println("Sorted array :  " + Arrays.toString(arr));
        System.out.println("Index of 45 : " + Arrays.binarySearch(arr,45));
        int[] copy = Arrays.copyOf(arr, 6);
        System.out.println("Copied array: " + Arrays.toString(copy));
        System.out.println("Equals (arr,copy) ? " + Arrays.equals(arr, copy));


    }
}
