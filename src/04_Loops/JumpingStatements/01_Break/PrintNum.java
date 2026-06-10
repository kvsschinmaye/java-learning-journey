public class PrintNum {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 100 ; i++)
        {
            System.out.println(i);
            if(i == 50) {
                break;
            }
        }
    }
}