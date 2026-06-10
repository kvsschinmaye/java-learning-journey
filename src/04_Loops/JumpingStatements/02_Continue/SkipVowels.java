import java.util.Scanner;

public class SkipVowels
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String text = sc.nextLine().toUpperCase();

        for(int i  = 0 ; i < text.length() ; i++ )
        {
            char ch =  text.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' ||ch ==  'U')
            {
                continue;
            }

            System.out.print(ch +"\t");
        }
    }
}