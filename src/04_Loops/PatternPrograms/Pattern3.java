public class Pattern3 {
    public static void main(String[] args) {

        int rows = 5;

        System.out.println("\n Pyramid Triangle Pattern \n");

        for(int i = 1 ; i <= rows ; i++ )
        {
            for(int space = rows - i ; space > 0 ; space--)
            {
                System.out.print("  ");
            }

            for(int j = 1 ; j <= (2 * i - 1 ) ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}