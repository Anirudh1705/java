public class Queue {
    private int[] array;
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int capacity; // Maximum capacity of the queue
    private int size; // Current size of the queue

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    // Method to remove an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int dequeuedItem = array[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedItem;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return array[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int count = 0;
        int index = front;
        while (count < size) {
            System.out.print(array[index] + " ");
            index = (index + 1) % capacity;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());

        queue.display();
    }
}
