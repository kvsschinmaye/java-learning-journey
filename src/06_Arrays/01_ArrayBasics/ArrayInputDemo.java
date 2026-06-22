import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Array Input Demo ===\n");

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:\n");

        for(int i = 0 ; i < n ; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nThe Elements in the array are : \n");

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("arr [" + i + "] = " + arr[i]);
        }

        System.out.println("\nArray Length   : " + arr.length);

        sc.close();

    }
}