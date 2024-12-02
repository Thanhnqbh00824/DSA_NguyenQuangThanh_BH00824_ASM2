import java.util.ArrayList;
import java.util.List;

class Student {
    String id;
    String name;
    double marks;

    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getRank() {
        if (marks < 5.0) return "Fail";
        else if (marks < 6.5) return "Medium";
        else if (marks < 7.5) return "Good";
        else if (marks < 9.0) return "Very Good";
        else return "Excellent";
    }
}

class TimeComplexityExample {
    public static Student findStudentById(List<Student> students, String id) {
        for (Student student : students) {
            if (student.id.equals(id)) {
                return student; // Found the student
            }
        }
        return null; // Student not found
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("001", "Nguyen Van A", 8.5));
        students.add(new Student("002", "Nguyen Van B", 6.0));
        students.add(new Student("003", "Nguyen Van C", 9.2));
        students.add(new Student("004", "Nguyen Van D", 7.5));
        students.add(new Student("005", "Nguyen Van H", 5.8));

        Student foundStudent = findStudentById(students, "003");
        if (foundStudent != null) {
            System.out.println("Found Student: " + foundStudent.name + " (" + foundStudent.getRank() + ")");
        } else {
            System.out.println("Student not found.");
        }
    }
}
