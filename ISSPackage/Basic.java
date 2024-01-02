package ISSPackage;

class Car {
    // State (Instance Variables)
    String brand;
    String model;
    int year;

    // Methods (Behaviors)
    public void start() {
        // Code to start the car
        System.out.println("The car has started.");
    }

    public void drive() {
        // Code to drive the car
        System.out.println("The car is moving.");
    }
    public void printCarDetails() {
        // Print the name of the car and its brand
        System.out.println("Car: " + year + " " + brand + " " + model);
    }
}
public class Basic {

	public static void main(String[] args) {
		 // Creating objects of the Car class
        Car myCar = new Car();
        Car friendCar = new Car();

        // Accessing state and invoking methods of objects
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        friendCar.brand = "Honda";
        friendCar.model = "Civic";
        friendCar.year = 2018;
        
        // Printing car details
        myCar.printCarDetails();
        friendCar.printCarDetails();

        myCar.start();
        friendCar.drive();
	}

}
