import java.util.Arrays;
import java.util.Scanner;

/* Time Complexity  : O(log n)
   Space Complexity : O(1)
*/

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {

        int low = 0 ;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
               return mid;
            }
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;

        }
          return -1 ;

        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Array size must be greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter key element : ");
        int key = sc.nextInt();

        System.out.println("\nSorted array :");
        System.out.print("[ ");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("]");

       int index = binarySearch(arr, key);

        if(index != -1) {
                System.out.println("\nKey is found at index : " + index);
                System.out.println("Key found at position : " + (index+1)) ;
            }
            else System.out.println("\nKey is not found");

        sc.close();
    }

}