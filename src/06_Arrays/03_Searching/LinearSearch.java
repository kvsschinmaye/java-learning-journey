import java.util.Scanner;

public class LinearSearch {

    /* Time Complexity  : O(n)
       Space Complexity : O(1)
    */

    public static void linearSearch(int[] arr , int key)
    {
        boolean found = false;
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++) {

            if (arr[i] == key) {
            if(!found) {
                System.out.println("\nKey found at index/indices: ");
            }
                System.out.print(i + "\t");
                found = true;
                count++;
            }
        }

        if(!found) {
                System.out.println("The key is not found");
            }
        else{
            System.out.println("\nThe key appears: " + count + " time(s) in the array");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Array size must be greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the key to search : ");
        int key = sc.nextInt();

        System.out.println("\nArray Elements : ");

        for(int num : arr)
        {
            System.out.print(num + "\t");
        }

        System.out.println("\n\nSearching for: " +key);

        linearSearch(arr,key);

        sc.close();
    }
}