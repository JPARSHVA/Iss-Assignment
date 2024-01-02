package ISSPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

public class ComparableStudentExample {
    public static void main(String[] args) {
        // Sorting a list of Student objects using Comparable
        List<Student> students = new ArrayList<>();
        students.add(new Student("Parshva", 101));
        students.add(new Student("Pari", 102));
        students.add(new Student("Sam", 100));

        Collections.sort(students);

        System.out.println("Sorted List of Students (using Comparable):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
