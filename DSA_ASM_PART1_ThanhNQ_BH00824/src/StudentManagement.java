public class StudentManagement {
    private StudentStack studentStack;

    public StudentManagement(int capacity) {
        studentStack = new StudentStack(capacity);
    }

    public void addStudent(String id, String name, double marks) {
        Student student = new Student(id, name, marks);
        studentStack.push(student);
    }

    public void removeStudent() {
        Student removedStudent = studentStack.pop();
        if (removedStudent == null) {
            System.out.println("Error: No student to remove (Stack underflow).");
        } else {
            System.out.println("Removed Student: " + removedStudent);
        }
    }

    public void searchStudent(String id) {
        Student[] students = studentStack.getAllStudents();
        boolean found = false;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Found Student: " + student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: Student with ID " + id + " not found.");
        }
    }

    public void updateStudent(String id, String newName, double newMarks) {
        Student[] students = studentStack.getAllStudents();
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                students[i] = new Student(id, newName, newMarks);
                System.out.println("Student updated: " + students[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: Student with ID " + id + " not found.");
        }
    }

    public void sortStudentsByMarks() {
        Student[] students = studentStack.getAllStudents();
        if (students.length == 0) {
            System.out.println("Error: Stack is empty. Cannot sort students.");
            return;
        }
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getMarks() > students[j].getMarks()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Students sorted by marks.");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayAllStudents() {
        studentStack.display();
    }
}
