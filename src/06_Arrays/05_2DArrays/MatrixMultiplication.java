import java.util.Scanner;

  public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of rows and columns of Matrix 1 :");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();

        System.out.println("Enter the size of rows and columns of Matrix 2 :");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        if (rows1 <= 0 || cols1 <= 0 || rows2 <= 0 || cols2 <= 0) {
            System.out.println("Give valid size for Rows and Columns");
            return;
        }
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible: columns of Matrix1 must equal rows of Matrix2.");
            return;
        }


        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of Matrix1:");
        for(int i = 0; i < rows1; i++)
        {
            for(int j = 0 ; j < cols1 ; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of Matrix2:");
        for(int i = 0; i < rows2; i++)
        {
            for(int j = 0; j < cols2; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMultiplication of Both Matrices : ");

        int[][] result = new int[rows1][cols2];

        for(int i = 0; i < rows1; i++)
        {
            for(int j = 0; j < cols2; j++)
            {
                for(int k = 0 ; k < cols1 ; k++)
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}