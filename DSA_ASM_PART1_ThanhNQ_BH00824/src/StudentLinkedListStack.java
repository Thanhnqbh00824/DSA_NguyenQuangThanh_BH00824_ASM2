class Node {
    Student student;       // Student data
    Node next;            // Reference to the next node

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }
}

public class StudentLinkedListStack {
    private Node top; // Reference to the top node of the stack

    // Constructor to initialize an empty stack
    public StudentLinkedListStack() {
        top = null; // Initially, the stack is empty
    }

    // Method to push a Student onto the stack
    public void push(Student student) {
        Node newNode = new Node(student); // Create a new node
        newNode.next = top;               // Link the new node to the previous top
        top = newNode;                    // Update the top to the new node
    }

    // Method to pop a Student from the stack
    public Student pop() {
        if (isEmpty()) {  // Check for stack underflow
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        Student poppedStudent = top.student; // Get the top student
        top = top.next;                     // Move the top to the next node
        return poppedStudent;                // Return the popped student
    }

    // Method to peek at the top Student without removing it
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return top.student; // Return the top student without popping
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null; // Stack is empty if top is null
    }

    // Method to display all students in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node current = top; // Start from the top of the stack
            while (current != null) { // Traverse the linked list
                System.out.println(current.student); // Display the student
                current = current.next; // Move to the next node
            }
        }
    }
}