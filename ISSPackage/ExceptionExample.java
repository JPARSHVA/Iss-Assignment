package ISSPackage;
import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            // Using throw to explicitly throw an exception
	            int result = divide(10, 0);
	            System.out.println("Result: " + result); // This line won't execute if an exception occurs
	        } catch (ArithmeticException ex) {
	            System.out.println("An arithmetic exception occurred: " + ex.getMessage());
	        }

	        try {
	            // Using throws to declare that the method might throw IOException
	            anotherMethod();
	        } catch (IOException ex) {
	            System.out.println("An IO exception occurred: " + ex.getMessage());
	        }
	    }

	    public static int divide(int num, int den) {
	        if (den == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        return num / den;
	    }

	    public static void anotherMethod() throws IOException {
	        // Simulating IOException
	        throw new IOException("Something went wrong with IO");

	}

}
