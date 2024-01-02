package ISSPackage;
//Encapsulation and Abstraction
class Animal {
 private String name;

 public Animal(String name) {
     this.name = name;
 }

 public void makeSound() {
     System.out.println("Some generic sound.");
 }

 // Encapsulation - Getter method to access private field
 public String getName() {
     return name;
 }
}

//Inheritance and Overriding
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }

 @Override
 public void makeSound() {
     System.out.println("Woof!");
 }
}

//Interfaces
interface Jumpable {
 void jump();
}

//Polymorphism using Interfaces
class Cat extends Animal implements Jumpable {
 public Cat(String name) {
     super(name);
 }

 @Override
 public void makeSound() {
     System.out.println("Meow!");
 }

 @Override
 public void jump() {
     System.out.println(getName() + " is jumping.");
 }
}

public class AnimalExample {
	public static void main(String[] args) {
        // Polymorphism through Inheritance and Overriding
        Animal myDog = new Dog("Buddy");
        myDog.makeSound(); // Output: Woof!

        Animal myCat = new Cat("Whiskers");
        myCat.makeSound(); // Output: Meow!

        // Polymorphism using Interfaces
        Jumpable jumpingCat = new Cat("Fluffy");
        jumpingCat.jump(); // Output: Fluffy is jumping.

        // Packages (import statement omitted)
        // Assuming Animal, Dog, Cat, and Jumpable are in package 'animals'
        // And Main is in the default package

      
    }

}
