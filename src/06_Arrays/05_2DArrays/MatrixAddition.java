import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns size of both Matrices :");
        int n = sc.nextInt();
        int m  = sc.nextInt();

        if(n <= 0 || m <= 0)
        {
            System.out.println("Rows and columns must be greater than 0");
            sc.close();
            return;
        }

        int[][] matrix1 = new int[n][m];
        System.out.println("Enter the elements in Matrix 1 : ");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
               matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] matrix2 = new int[n][m];
        System.out.println("Enter the elements in Matrix 2 : ");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nAddition of both Matrices : ");

        int[][] add = new int[n][m];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                add[i][j] =  matrix1[i][j] + matrix2[i][j];
                System.out.printf("%4d",add[i][j]);
            }

            System.out.println();

        }

       sc.close();

    }
}