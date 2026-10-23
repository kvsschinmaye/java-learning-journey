import java.util.Scanner;

abstract class Vehicle1 {
    abstract double calculateMileage();
}

class Car1 extends Vehicle1 {
    int distance;
    int fuel;

   Car1(int distance , int fuel ){
        this.distance = distance;
        this.fuel = fuel;
    }
    @Override
    double calculateMileage(){
         double mileage = (double) distance/fuel;
         return mileage;
    }
}

public class VehicleAbstraction{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the distance travelled : ");
        int dis = s.nextInt();
        if (dis < 0) {
            System.out.println("Distance cannot be negative.");
            s.close();
            return;
        }

        System.out.print("Enter the fuel consumed      : ");
        int fue = s.nextInt();
        if (fue <= 0) {
            System.out.println("Fuel consumed must be greater than zero.");
            s.close();
            return;
        }

        Vehicle1 v = new Car1(dis,fue);

        System.out.printf("\nMileage of the Car is        : %.2f%n", v.calculateMileage());

        s.close();
    }
}