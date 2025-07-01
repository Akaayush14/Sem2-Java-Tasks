class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car. Brand: Toyota, Model: Corolla, Year: 2022");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.display();
    }
}
