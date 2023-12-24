class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class Singly_LinkedList {
    Node1 head;

    // Method to insert a new node at the end of the linked list
    void add(int data) {
        Node1 newNode1 = new Node1(data);

        if (head == null) {
            head = newNode1;
            return;
        }

        Node1 last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode1;
    }

    // Method to display the linked list
    void display() {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Singly_LinkedListExample {
    public static void main(String[] args) {
        Singly_LinkedList linkedList = new Singly_LinkedList();

        // Append nodes to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Display the linked list
        System.out.println("Linked List:");
        linkedList.display();
    }
}
