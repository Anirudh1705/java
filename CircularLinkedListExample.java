class CircularLinkedList {
    Node head;

    // Method to insert a new node at the end of the circular linked list
    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head; // Point back to itself for circularity
            return;
        }

        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

        last.next = newNode;
        newNode.next = head; // Point back to the head for circularity
    }

    // Method to display the circular linked list
    void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        // Append nodes to the circular linked list
        circularList.append(1);
        circularList.append(2);
        circularList.append(3);

        // Display the circular linked list
        System.out.println("Circular Linked List:");
        circularList.display();
    }
}
