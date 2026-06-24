import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter array length : ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Array size must be greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter array elements : ");

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("=== Array Statistics ===");
        System.out.println("\nArray elements ");

        for(int num : arr)
        {
            System.out.print(num + "\t" );
        }

        int largest = arr[0];
        int smallest = arr[0];
        int evenCount = 0;

        for(int num : arr)
        {
            if (num % 2 == 0)
            {
                evenCount++;
            }

            if(num > largest)
                largest = num;

            if(num < smallest)
                smallest = num;
        }

        System.out.println("\nLargest Element         : " + largest);
        System.out.println("Smallest Element        : " + smallest);
        System.out.println("Number of Even Elements : " + evenCount);
        System.out.println("Number of Odd Elements  : " + (arr.length - evenCount));
        System.out.println("Sum                     : " + sum);
        System.out.printf("Average                 : %.2f%n", average);

        sc.close();

    }
}