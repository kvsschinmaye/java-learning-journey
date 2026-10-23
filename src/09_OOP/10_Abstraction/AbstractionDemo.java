abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s  = new Circle(5);
        System.out.printf("\nArea of Circle : %.2f%n" , s.calculateArea());
    }
}
