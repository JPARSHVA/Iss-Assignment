package ISSPackage;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hello, ";
        String name = "Parshva";

        // Concatenating strings
        String message = greeting + name;

        // Getting string length
        int length = message.length();

        // Accessing characters in a string
        char firstChar = message.charAt(0);

        // Checking for substring
        boolean containsName = message.contains(name);

        // Displaying results
        System.out.println("Message: " + message);
        System.out.println("Length of message: " + length);
        System.out.println("First character: " + firstChar);
        System.out.println("Contains name? " + containsName);

	}

}
