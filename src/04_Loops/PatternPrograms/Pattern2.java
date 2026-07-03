public class Pattern2 {
    public static void main(String[] args) {
        int rows = 5;
        int i = rows;

        System.out.println("\n Inverted Triangle Pattern \n");
        while (i >= 1) {
            int j = 1;

            while (j <= i) {

                System.out.print(" * ");
                j++;
            }

            System.out.println();
            i--;

        }
    }
}