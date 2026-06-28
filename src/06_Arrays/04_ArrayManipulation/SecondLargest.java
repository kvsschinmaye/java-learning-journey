import java.util.Scanner;

public class SecondLargest {

    public static void findLargestAndSecondLargest(int[] arr)
    {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr) {
            if( num > first ) {
                second = first;
                first = num;
            }
            else if(num > second && num != first) {
                second = num;
            }
        }

        System.out.println("\nLargest        : " + first);

        if(second == Integer.MIN_VALUE) {
            System.out.println("\nNo distinct second largest element.");
        } else {
            System.out.println("\nSecond largest : " + second);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter array size : ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Array size must be greater than 0");
            sc.close();
            return;
        }

        if (n < 2) {
            System.out.println("Second largest does not exist.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        System.out.println("\nOriginal array : ");
        for(int num : arr)
            System.out.print(num + "\t");

        findLargestAndSecondLargest(arr);

        sc.close();

    }
}