package ISSPackage;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample {
    public static void main(String[] args) throws Exception {
        // Creating an object to serialize to JSON
        Student student = new Student("John", 25, "Computer Science");

        // Creating ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        // Serializing Java object to JSON
        String jsonString = mapper.writeValueAsString(student);
        System.out.println("Serialized JSON: " + jsonString);
    }
}

class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getters and setters (for Jackson serialization)
    // For brevity, not added here
}
