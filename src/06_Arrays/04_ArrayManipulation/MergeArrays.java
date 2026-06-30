import java.util.Scanner;
import java.util.Arrays;

public class MergeArrays {

    public static int[] mergeArrays(int[] arr1 , int[] arr2)
    {
        int[] merged = new int[arr1.length + arr2.length];

        for(int i = 0 ; i < arr1.length ; i++) {
            merged[i] = arr1[i];
        }

        for(int i = 0 ; i < arr2.length ; i++) {
            merged[arr1.length + i] = arr2[i];
        }

       return merged;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1 : ");
        int n = sc.nextInt();

        System.out.print("Enter size of array 2 : ");
        int m = sc.nextInt();

        if(n <= 0 || m <= 0)
        {
            System.out.print("Array size must be greater than 0");
            sc.close();
            return;
        }

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter array 1 : ");
        for(int i = 0 ; i < n ; i++)
            arr1[i] = sc.nextInt();

        System.out.println("Enter array 2 : " );
        for(int i = 0 ; i < m ; i++)
            arr2[i] = sc.nextInt();


       int[] manualMerge = mergeArrays(arr1,arr2);

        System.out.println("\nArray 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
        System.out.println("=== Manual Merged Array ===");
        System.out.println(Arrays.toString(manualMerge));

        // using System.arraycopy()
        System.out.println("\n\n=== Using System.arraycopy() ===");

        int[] systemMerge = new int[arr1.length + arr2.length];

        System.arraycopy(arr1 , 0 , systemMerge, 0 , arr1.length);
        System.arraycopy(arr2 , 0 , systemMerge,  arr1.length, arr2.length);

        System.out.println(Arrays.toString(systemMerge));

        sc.close();
    }
}