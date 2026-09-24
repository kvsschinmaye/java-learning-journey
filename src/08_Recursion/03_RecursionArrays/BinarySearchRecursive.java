import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {

    public static int binarySearch(int[] arr,int first , int last, int key){

        if(first > last)
            return -1;

    int mid = first + (last - first)/2 ;

    if(arr[mid] == key)
        return mid;
    else if(arr[mid] < key)
        return binarySearch(arr,mid + 1,last,key);
    else
        return binarySearch(arr,first,mid - 1,key);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key element to search : ");
        int key = sc.nextInt();

        Arrays.sort(arr);

        int result = binarySearch(arr,0,n-1,key);

        if(result != -1)
            System.out.println("Key is found at index : " +result);
        else
            System.out.println("Key is not found");

        sc.close();
    }
}