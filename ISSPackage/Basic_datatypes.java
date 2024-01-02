package ISSPackage;
class Car1 {
    // Instance Variables (Basic Data Types)
    private final String brand; // Final variable
    private String model;
    private int year;
    private static int countOfCars = 0; // Class variable

    // Constructor
    public Car1(String brand, String model, int year) {
        this.brand = brand; // Initializing final variable in constructor
        this.model = model;
        this.year = year;
        countOfCars++; // Incrementing count of cars upon object creation
    }

    // Method to get count of cars
    public static int getCountOfCars() {
        return countOfCars;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class Basic_datatypes{

    public static void main(String[] args) {
        // Creating objects of Car class using Constructor
        Car1 myCar = new Car1("Toyota", "Corolla", 2020);
        Car1 friendCar = new Car1("Honda", "Civic", 2018);

        // Displaying car details
        System.out.println("Parshva's Car Details:");
        myCar.displayCarDetails();

        System.out.println("\nFriend's Car Details:");
        friendCar.displayCarDetails();

        // Displaying count of cars created
        System.out.println("\nTotal Cars Created: " + Car1.getCountOfCars());
    }
}
