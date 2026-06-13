import java.util.Scanner;

public class TriangleValidator {

    public boolean isValid(int a , int b , int c)
    {
        return(a + b > c && b + c > a && a + c > b);
    }

    public String getType(int a , int b , int c)
    {

        if( a == b && b == c)
            return "Equilateral";
        else if(  a == b || b == c|| c == a)
            return "Isosceles";
        else
            return "Scalene";

    }

    public boolean isRightAngled(int a , int b , int c)
    {
        int max = Math.max(a,Math.max(b,c));
        int sumSquares = a * a + b * b + c * c ;
        return(2 * max * max == sumSquares);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        TriangleValidator tv = new TriangleValidator();
        boolean result = tv.isValid(a,b,c);

        if(result)
        {
            System.out.println("This forms a triangle");
            System.out.println("Type : "+tv.getType(a,b,c));
            if(tv.isRightAngled(a,b,c))
            {
                System.out.println("It is a Right-angled triangle");
            }
        }

        else {
            System.out.println("This won't form a triangle");
        }


        sc.close();

    }
}