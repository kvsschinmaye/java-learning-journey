public class CircleAreaCircumference {
    public static void main(String[] args) {

        double radius = 9.6;

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("=== Circle Details ===");

        System.out.printf("Radius of the circle        : %.2f%n" ,radius);
        System.out.printf("Area of the circle          : %.2f%n" , area);
        System.out.printf("Circumference of the circle : %.2f%n" ,circumference);
    }
}