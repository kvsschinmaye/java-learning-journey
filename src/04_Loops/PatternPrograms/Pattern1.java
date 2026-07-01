public class Pattern1 {

    public static void main(String[] args) {
        int i = 1;
        int rows = 5;

        System.out.println("\n Right-Angled Triangle Pattern \n");
        while(i <= rows)
        {
            int j = 1;
            while(j <= i)
            {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}