package ISSPackage;

import java.util.HashSet;
import java.util.Set;

public class StudentSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a Set of student IDs
        Set<Integer> studentIDs = new HashSet<>();

        // Adding student IDs to the set
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(102); // Adding a duplicate ID

        // Displaying unique student IDs    	
        System.out.println("Set of Student IDs:");
        for (int id : studentIDs) {
            System.out.println(id);
        }
	}

}
