package ISSPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studen {
    private String name;
    private int id;

    public Studen(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }

    // Getter for ID
    public int getId() {
        return id;
    }
}

public class ComparatorStudentExample {
    public static void main(String[] args) {
        // Sorting a list of Student objects using Comparator
        List<Studen> students = new ArrayList<>();
        students.add(new Studen("Parshva", 101));
        students.add(new Studen("Pari", 102));
        students.add(new Studen("Sam", 100));

        // Using a Comparator to sort by ID in descending order
        Comparator<Studen> idComparator = Comparator.comparingInt(Studen::getId).reversed();
        Collections.sort(students, idComparator);

        System.out.println("Sorted List of Students (using Comparator):");
        for (Studen studen : students) {
            System.out.println(studen);
        }
    }
}
