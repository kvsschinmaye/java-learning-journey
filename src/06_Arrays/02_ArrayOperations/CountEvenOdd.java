import java.util.Scanner;

public class CountEvenOdd {

    public static void countEvenOdd(int[] arr)
    {
        int evenCount = 0;
        int oddCount = 0;

        for(int num : arr)
        {
            if(num % 2 == 0)
            {
                evenCount++;
            }
            else
                oddCount++;
        }

        System.out.print("\n\nEven numbers count : " + evenCount);
        System.out.println("\nOdd numbers count  : " + oddCount);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter array size : ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Size of the array must be greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        System.out.println("\nArray elements : ");
        for(int num : arr)
            System.out.print(num + "\t");

        countEvenOdd(arr);

        sc.close();

    }
}