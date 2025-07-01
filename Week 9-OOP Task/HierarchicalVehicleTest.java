class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is being ridden.");
    }
}

public class HierarchicalVehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        car.startEngine();
        car.drive();
        car.stopEngine();

        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}
