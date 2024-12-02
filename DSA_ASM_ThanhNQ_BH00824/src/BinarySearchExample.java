import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BinarySearchExample {
    public static Student binarySearchById(List<Student> students, String id) {
        int low = 0, high = students.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Student midStudent = students.get(mid);

            if (midStudent.id.equals(id)) {
                return midStudent;
            } else if (midStudent.id.compareTo(id) < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
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

        // Sort the list by ID for binary search
        Collections.sort(students, Comparator.comparing(student -> student.id));

        Student foundStudent = binarySearchById(students, "003");
        if (foundStudent != null) {
            System.out.println("Found Student: " + foundStudent.name + " (" + foundStudent.getRank() + ")");
        } else {
            System.out.println("Student not found.");
        }
    }
}
