import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
    String id;
    String name;
    double marks;

    public Students(String id, String name, double marks) {
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

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Rank: " + getRank();
    }
}

public class StudentManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("001", "Nguyen Van A", 8.5));
        students.add(new Student("002", "Nguyen Van B", 6.0));
        students.add(new Student("003", "Nguyen Van C", 9.2));
        students.add(new Student("004", "Nguyen Van D", 7.5));
        students.add(new Student("005", "Nguyen Van H", 5.8));
        students.add(new Student("006", "Nguyen Van K", 4.2));
        students.add(new Student("007", "Nguyen Van M", 9.0));

        // Reusable: Sorting by Marks
        Collections.sort(students, Comparator.comparingDouble(s -> s.marks));
        System.out.println("Sorted by Marks:");
        students.forEach(System.out::println);

        // Reusable: Searching for a specific student
        students.stream()
                .filter(s -> s.id.equals("004"))
                .forEach(s -> System.out.println("\nFound Student: " + s));
    }
}
