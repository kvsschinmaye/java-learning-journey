import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int[] arr)
    {
        for(int left = 0 , right = arr.length-1 ; left < right ; left++ , right--)
        {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter array size : ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Array size must be greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        System.out.println("\nOriginal array: ");
        for(int num : arr)
            System.out.print(num + "\t");

        reverseArray(arr);


        System.out.println("\n\nReversed array: ");
        for(int num : arr)
            System.out.print(num + "\t");

        sc.close();

    }
}