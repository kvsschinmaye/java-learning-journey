import java.util.Scanner;

public class SumOfDiagonals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Square Matrix(n x n) : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Give a valid positive size for the square matrix.");
            sc.close();
            return;
        }

        int[][] matrix = new int[n][n];

        System.out.println("Enter elements of Matrix : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }


        int sumPrimary = 0;
        int sumSecondary = 0;

        System.out.println("Primary diagonal elements : ");
        for (int i = 0; i < n ; i++) {
             sumPrimary += matrix[i][i];
            System.out.printf("%4d",matrix[i][i]);
        }
        System.out.printf("\nSum of Primary Diagonal : %d", sumPrimary);


        System.out.println("\n\nSecondary diagonal elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            sumSecondary += matrix[i][n - 1 - i];
            System.out.printf("%4d",matrix[i][n - 1 - i]);
        }
        System.out.printf("\nSum of Secondary Diagonal : %d", sumSecondary);

        int total = sumPrimary + sumSecondary;
        if(n % 2 == 1)
        {
            total -= matrix[n/2][n/2];
        }
        System.out.printf("\nCombined Sum of diagonals : %d", total);

         sc.close();
    }
}