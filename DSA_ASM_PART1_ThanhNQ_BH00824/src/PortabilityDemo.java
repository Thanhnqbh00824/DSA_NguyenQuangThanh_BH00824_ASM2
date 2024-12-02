import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class PortableStudentManager {
    private List<Student> students;

    public PortableStudentManager() {
        this.students = new ArrayList<>(); // In-memory storage by default
    }

    // Add a new student
    public void addStudent(String id, String name, double marks) {
        students.add(new Student(id, name, marks));
    }

    // Display all students
    public void displayStudents() {
        System.out.println("Student List:");
        students.forEach(System.out::println);
    }

    // Export students to a file (alternative backend)
    public void exportToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.write(student.id + "," + student.name + "," + student.getMarks() + "," + student.getRank());
                writer.newLine();
            }
            System.out.println("Data exported to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class PortabilityDemo {
    public static void main(String[] args) {
        // Initialize the student manager
        PortableStudentManager manager = new PortableStudentManager();

        // Add students (data provided by user)
        manager.addStudent("001", "Nguyen Van A", 8.5);
        manager.addStudent("002", "Nguyen Van B", 6.0);
        manager.addStudent("003", "Nguyen Van C", 9.2);
        manager.addStudent("004", "Nguyen Van D", 7.5);
        manager.addStudent("005", "Nguyen Van H", 5.8);
        manager.addStudent("006", "Nguyen Van K", 4.2);
        manager.addStudent("007", "Nguyen Van M", 9.0);

        // Display students (platform-independent console output)
        manager.displayStudents();

        // Export data to a file (alternative storage mechanism)
        manager.exportToFile("students.csv");
    }
}
