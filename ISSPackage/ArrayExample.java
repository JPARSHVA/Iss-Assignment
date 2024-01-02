package ISSPackage;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Length of array: " + numbers.length);

        // Modifying an array element
        numbers[2] = 35;

        // Displaying all elements in the array
        System.out.println("Elements of the array:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        // Creating a 2D array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Accessing elements of the 2D array
        System.out.println("Element at row 1, column 2: " + matrix[0][1]);
        System.out.println("Number of rows: " + matrix.length);
        System.out.println("Number of columns in row 1: " + matrix[0].length);

        // Displaying elements of the 2D array
        System.out.println("Elements of the 2D array:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

	}

}
