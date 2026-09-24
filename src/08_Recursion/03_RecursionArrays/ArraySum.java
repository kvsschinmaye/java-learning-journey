import java.util.Scanner;

public class ArraySum {

    public static int sum(int[] arr,int i){

        if(i == arr.length)
           return 0;

        return arr[i]+ sum(arr,i+1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array Elements: ");
        for(int i = 0 ; i < n ; i++){
           arr[i] = sc.nextInt();
        }

        System.out.println("\nSum of the array : " + sum(arr,0));

        sc.close();

    }

}