public class StudentStack {
    // Array to store the stack elements (Student objects)
    private Student[] stack;
    // Index to track the top of the stack
    private int top;
    // Constructor to initialize the stack with a given capacity
    public StudentStack(int capacity) {
        stack = new Student[capacity];
        top = -1; // Initially, stack is empty
    }
    // Method to push a Student onto the stack
    public void push(Student student) {
        if (top == stack.length - 1) {  // Stack overflow condition
            System.out.println("Error: Stack is full. Cannot add student.");
        } else {
            stack[++top] = student; // Increment top and add the student
        }
    }
    // Method to pop a Student from the stack
    public Student pop() {
        if (isEmpty()) {  // Stack underflow condition
            System.out.println("Error: Stack is empty. No student to remove.");
            return null;
        } else {
            return stack[top--]; // Return the top student and decrement top
        }
    }
    // Method to peek at the top Student without removing it
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            return stack[top]; // Return the top student without popping
        }
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    // Method to get all students in the stack (for searching or sorting purposes)
    public Student[] getAllStudents() {
        Student[] students = new Student[top + 1]; // Create a new array of the correct size
        System.arraycopy(stack, 0, students, 0, top + 1); // Copy all elements
        return students;
    }
    // Method to display all students in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}