package ISSPackage;
import java.util.ArrayList;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        // Creating a List of students
        List<String> studentNames = new ArrayList<>();

        // Adding students to the list
        studentNames.add("Parshva Jain");
        studentNames.add("Pari");
        studentNames.add("Sam");

        // Displaying student names
        System.out.println("List of Students:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }x
}
