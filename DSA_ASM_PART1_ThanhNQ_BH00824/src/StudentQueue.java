public class StudentQueue {
    private Node front;    // Reference to the front of the queue
    private Node rear;     // Reference to the rear of the queue

    public StudentQueue() {
        front = null;      // Initially, the queue is empty
        rear = null;
    }

    // Method to enqueue a student
    public void enqueue(Student student) {
        Node newNode = new Node(student);
        if (rear != null) {
            rear.next = newNode; // Link the new node at the end of the queue
        }
        rear = newNode; // Update the rear to the new node
        if (front == null) {
            front = rear; // If the queue was empty, front is also the new node
        }
    }

    // Method to dequeue a student
    public Student dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        Student student = front.student; // Get the student from the front
        front = front.next; // Move front to the next node
        if (front == null) {
            rear = null; // If the queue is now empty, update rear as well
        }
        return student;
    }
}