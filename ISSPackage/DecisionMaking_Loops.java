package ISSPackage;

import java.util.Scanner;

public class DecisionMaking_Loops {
	public static void main(String[] args) {
		// taking input from user
		Scanner X = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = X.nextInt();
		// If-else statements
		if(num > 0) {
			System.out.println("The entered number is positive.");
		}
		else if(num < 0) {
			System.out.println("The entered number is negative.");
		}
		else {
			System.out.println("The entered number is zero.");
		}
		// For loop to print numbers from 1 to 5
		System.out.println("For loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // While loop to print numbers from 1 to 5
        int i = 1;
        System.out.println("While loop.");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("Do While Loop.");
        int y = 1;
        do {
            System.out.println(i);
            y++;
        } while (y <= 5);
	}

}
