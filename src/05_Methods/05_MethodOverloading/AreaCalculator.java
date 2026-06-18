public class AreaCalculator {

    public static int area(int side)
    {
        return side * side;
    }

    public static int area (int length , int breadth)
    {
        return length * breadth;
    }

    public static double area(double radius)
    {
        return (Math.PI * radius * radius);
    }

    public static void main(String[] args) {

        System.out.print("\n Area of square    : " + area(45));
        System.out.print("\n Area of rectangle : " + area(16,12));
        System.out.printf("\n Area of circle    : %.2f%n" , area(7.0));

    }
}