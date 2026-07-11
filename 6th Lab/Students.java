import java.util.Scanner;
class StudentDatabase {
    // Static array to store student objects
    static Student[] students;

    public static void main(String args[]) {
        // Initialize the students array with some student objects
        students = new Student[]{
            new Student(1, "Alice", 20),
            new Student(2, "Bob", 21),
            new Student(3, "Charlie", 22),
            new Student(4, "David", 23),
            new Student(5, "Eve", 24)
        };

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int searchId = scanner.nextInt();

        // Search for the student by ID
        Student foundStudent = searchStudentById(searchId);

        // Display the result
        if (foundStudent != null) {
            System.out.println("Student found:");
            foundStudent.displayDetails();
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        scanner.close();
    }

    // Method to search for a student by ID
    static Student searchStudentById(int ID) {
        for (Student student : students) {
            if (student.id == ID) {
                return student;
            }
        }
        return null; // Return null if no student is found with the given ID
    }
}
class Student {
    int id;
    String name;
    int age;

    // Constructor to initialize student attributes
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

