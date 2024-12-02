public class Main {
    public static void main(String[] args) {
        // Initialize the management system with a stack capacity of 7
        StudentManagement management = new StudentManagement(7);

        // Adding 7 students
        management.addStudent("001", "Nguyen Van A", 8.5);
        management.addStudent("002", "Nguyen Van B", 6.0);
        management.addStudent("003", "Nguyen Van C", 9.2);
        management.addStudent("004", "Nguyen Van D", 7.5);
        management.addStudent("005", "Nguyen Van H", 5.8);
        management.addStudent("006", "Nguyen Van K", 4.2);
        management.addStudent("007", "Nguyen Van M", 9.0);

        // Display all students
        System.out.println("All students:");
        management.displayAllStudents();

        // Search for a student by ID
        System.out.println("\nSearching for Student with ID 003:");
        management.searchStudent("003");

        // Update a student's details
        System.out.println("\nUpdating Student with ID 005:");
        management.updateStudent("005", "Nguyen Van X", 5.9);
        management.displayAllStudents();

        // Sort students by their marks
        System.out.println("\nSorting students by marks:");
        management.sortStudentsByMarks();

        // Remove the top student from the stack
        System.out.println("\nRemoving top student:");
        management.removeStudent();
        management.displayAllStudents();
    }
}