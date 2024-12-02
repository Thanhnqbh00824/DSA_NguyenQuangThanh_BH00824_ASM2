public class Student {
    // Private attributes for ID, name, and marks
    public String id;
    public String name;
    public double marks;

    // Constructor to initialize a Student object
    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter for Student ID
    public String getId() {
        return id;
    }

    // Getter for Student Name
    public String getName() {
        return name;
    }

    // Getter for Student Marks
    public double getMarks() {
        return marks;
    }

    // Method to calculate the rank based on the marks
    public String getRank() {
        if (marks >= 9.0) {
            return "Excellent";
        } else if (marks >= 7.5) {
            return "Very Good";
        } else if (marks >= 6.5) {
            return "Good";
        } else if (marks >= 5.0) {
            return "Medium";
        } else {
            return "Fail";
        }
    }

    // Overriding toString method to display student details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Rank: " + getRank();
    }
}