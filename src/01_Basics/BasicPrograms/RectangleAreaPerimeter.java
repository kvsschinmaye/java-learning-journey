public class RectangleAreaPerimeter{
    public static void main(String[] args) {

        double length = 14.6;
        double breadth = 6.7;

        System.out.println("=== Rectangle Details ===");
        System.out.printf("Length  : %.2f%nBreadth : %.2f%n" ,length,breadth);

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println();

        System.out.printf("Area of the Rectangle      : %.2f%n",area);
        System.out.printf("Perimeter of the Rectangle : %.2f",perimeter);

    }
}