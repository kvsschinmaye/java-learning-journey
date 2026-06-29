import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {

    public static int[] manualCopy(int[] arr)
    {
        int[] arr2 = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Array size must be greater than 0");
            sc.close();
            return;
        }

        int[] originalArray = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < n ; i++) {
            originalArray[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array:");
        System.out.println(Arrays.toString(originalArray));

        int[] manualCopy = manualCopy(originalArray);
        int[] systemCopy = new int[originalArray.length];
        int[] arraysCopy = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("\nCopied Array (Manual):");
        System.out.println(Arrays.toString(manualCopy));

        System.out.println("\nCopied Array (System.arraycopy()):");
        System.arraycopy(originalArray, 0, systemCopy, 0, originalArray.length);
        System.out.println(Arrays.toString(systemCopy));

        System.out.println("\nCopied Array (Arrays.copyOf()):");
        System.out.println(Arrays.toString(arraysCopy));


        originalArray[1] = 91;

        System.out.println("\nAfter modifying original array:");

        System.out.println("Original : " + Arrays.toString(originalArray));
        System.out.println("Manual   : " + Arrays.toString(manualCopy));
        System.out.println("System   : " + Arrays.toString(systemCopy));
        System.out.println("CopyOf   : " + Arrays.toString(arraysCopy));

        sc.close();
    }
}