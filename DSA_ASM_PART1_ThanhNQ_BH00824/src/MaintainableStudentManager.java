import java.util.ArrayList;
import java.util.List;

class RankingSystem {
    public static String getRank(double marks) {
        if (marks < 5.0) return "Fail";
        else if (marks < 6.5) return "Medium";
        else if (marks < 7.5) return "Good";
        else if (marks < 9.0) return "Very Good";
        else return "Excellent";
    }
}

public class MaintainableStudentManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("001", "Nguyen Van A", 8.5));
        students.add(new Student("002", "Nguyen Van B", 6.0));
        students.add(new Student("003", "Nguyen Van C", 9.2));
        students.add(new Student("004", "Nguyen Van D", 7.5));
        students.add(new Student("005", "Nguyen Van H", 5.8));
        students.add(new Student("006", "Nguyen Van K", 4.2));
        students.add(new Student("007", "Nguyen Van M", 9.0));

        System.out.println("Student List with Updated Ranking Logic:");
        students.forEach(student -> {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Marks: " + student.marks + ", Rank: " + RankingSystem.getRank(student.marks));
        });

        // Example of maintainability: Modifying the ranking thresholds
        System.out.println("\nUpdating Ranking Logic...");
        System.out.println("Updated Ranking for Nguyen Van K: " + RankingSystem.getRank(4.2)); // Test the updated rank logic
    }
}
