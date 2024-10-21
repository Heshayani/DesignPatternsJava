// Vehicle interface (Product)
interface Vehicle {
    void drive();
}

// Concrete implementations of Vehicle
class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a bike.");
    }
}

// Factory class to create objects
class VehicleFactory {
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        return null;
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        // Create and use Car
        Vehicle car = factory.createVehicle("Car");
        car.drive();

        // Create and use Bike
        Vehicle bike = factory.createVehicle("Bike");
        bike.drive();
    }
}
