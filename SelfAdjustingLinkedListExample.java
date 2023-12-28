class SelfAdjustingLinkedList {
    Node head;

    // Method to insert a new node at the front of the linked list
    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to search for a node with the given key and move it to the front
    void searchAndMoveToFront(int key) {
        Node current = head;
        Node prev = null;

        // Search for the key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key is found, move the node to the front
        if (current != null) {
            if (prev != null) {
                prev.next = current.next;
                current.next = head;
                head = current;
            }
        }
    }

    // Method to display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SelfAdjustingLinkedListExample {
    public static void main(String[] args) {
        SelfAdjustingLinkedList list = new SelfAdjustingLinkedList();

        // Insert nodes at the front
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);

        // Display the initial linked list
        System.out.println("Initial Linked List:");
        list.display();

        // Search for and move node with key 2 to the front
        list.searchAndMoveToFront(2);

        // Display the linked list after self-adjusting operation
        System.out.println("Linked List after Self-Adjusting (moving 2 to the front):");
        list.display();
    }
}

