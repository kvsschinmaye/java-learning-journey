import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of rows and columns of the matrix: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Give valid size for rows and columns.");
            return;
        }

        int[][] matrix = new int[n][m];

        System.out.println("Enter elements of the matrix : ");

        for(int i = 0 ; i < n ; i ++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


            int[][] transpose = new int[m][n];

            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nTransposed Matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", transpose[i][j]);
            }
            System.out.println();
        }

        sc.close();

    }
}