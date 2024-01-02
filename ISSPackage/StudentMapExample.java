package ISSPackage;

import java.util.HashMap;
import java.util.Map;

public class StudentMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating a Map of student names and IDs
        Map<String, Integer> studentMap = new HashMap<>();

        // Adding students' names and IDs to the map
        studentMap.put("Parshva", 101);
        studentMap.put("Pari", 102);
        studentMap.put("Sam", 103);

        // Displaying student names and their IDs
        System.out.println("Student Names and IDs:");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", ID: " + entry.getValue());
        }
	}

}
