class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Method to insert a new node at the end of the doubly linked list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, the new node is both the head and the tail
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, add the new node to the end and update the tail
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to remove a node from the end of the doubly linked list
    void removeFromEnd() {
        if (head == null) {
            System.out.println("Doubly linked list is empty. Cannot remove from the end.");
            return;
        }

        if (head == tail) {
            // If there is only one node, remove it
            head = null;
            tail = null;
        } else {
            // Otherwise, remove the last node and update the tail
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Method to display the doubly linked list forward
    void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to display the doubly linked list backward
    void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Doubly_LL {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Insert nodes at the end
        doublyLinkedList.insertAtEnd(1);
        doublyLinkedList.insertAtEnd(2);
        doublyLinkedList.insertAtEnd(3);

        // Display the doubly linked list forward
        System.out.println("Doubly Linked List Forward:");
        doublyLinkedList.displayForward();

        // Remove from the end
        doublyLinkedList.removeFromEnd();

        // Display the doubly linked list forward after removal
        System.out.println("Doubly Linked List Forward after removing from the end:");
        doublyLinkedList.displayForward();

        // Display the doubly linked list backward after removal
        System.out.println("Doubly Linked List Backward after removing from the end:");
        doublyLinkedList.displayBackward();
    }
}
