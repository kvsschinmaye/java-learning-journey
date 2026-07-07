public class Pattern4 {
    public static void main(String[] args) {

        int rows = 5;

        System.out.println("\n Number Triangle Pattern \n");

        for(int i = 1 ; i <= rows ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(" "+j);
            }

            System.out.println();
        }

    }
}