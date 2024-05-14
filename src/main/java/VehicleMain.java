// Abstract class Vehicle
abstract class Vehicle {
    // Attributes
    String make;
    String model;
    int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method accelerate()
    abstract void accelerate();

    // Method to print vehicle details and acceleration behavior
    public void printDetailsAndAccelerate() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.print("Acceleration Behavior: ");
        accelerate();
        System.out.println();
    }
}

// Subclass Car
class Car extends Vehicle {
    // Constructor
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    // Implement accelerate() method for Car
    @Override
    void accelerate() {
        System.out.println("Car accelerates smoothly.");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    // Constructor
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    // Implement accelerate() method for Bike
    @Override
    void accelerate() {
        System.out.println("Bike accelerates aggressively.");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Car car = new Car("Toyota", "Camry", 2022);
        Bike bike = new Bike("Honda", "CBR1000RR", 2023);

        // Print details and acceleration behavior for Car and Bike
        car.printDetailsAndAccelerate();
        bike.printDetailsAndAccelerate();
    }
}
