class SinglyLinkedListWithTail {
    Node head;
    Node tail;

    // Method to insert a new node at the end of the linked list
    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, both head and tail point to the new node
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, add the new node to the end and update the tail
            tail.next = newNode;
            tail = newNode;
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

public class SinglyLinkedListWithTailExample {
    public static void main(String[] args) {
        SinglyLinkedListWithTail linkedList = new SinglyLinkedListWithTail();

        // Append nodes to the linked list
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        // Display the linked list
        System.out.println("Linked List:");
        linkedList.display();
    }
}
