class Vehicle {
    String brand;

    void displayVehicle(){
        System.out.println("\nBrand of the Vehicle : " + brand);
    }
}

class Car extends Vehicle {
    String fuelType;

    void displayVehicle() {
        super.displayVehicle();
        System.out.println("Type of the Fuel     : " +fuelType);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Suzuki";
        c.fuelType = "Diesel";
        c.displayVehicle();
    }
}