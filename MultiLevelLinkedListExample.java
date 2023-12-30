class MultiLevelLinkedList {
    Node head;

    // Method to flatten the multilevel linked list
    void flatten() {
        flattenRecursive(head);
    }

    // Recursive method to flatten the multilevel linked list
    private void flattenRecursive(Node node) {
        if (node == null) {
            return;
        }

        Node current = node;

        // Find the tail of the next level
        while (current.next != null) {
            current = current.next;
        }

        // Connect the tail to the child of the current node
        if (node.child != null) {
            current.next = node.child;
            node.child = null;
            flattenRecursive(current.next);
        }

        // Continue flattening the remaining nodes
        flattenRecursive(node.next);
    }

    // Method to display the multilevel linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class MultiLevelLinkedListExample {
    public static void main(String[] args) {
        MultiLevelLinkedList multiLevelList = new MultiLevelLinkedList();

        // Create a multilevel linked list
        multiLevelList.head = new Node(1);
        multiLevelList.head.next = new Node(2);
        multiLevelList.head.next.next = new Node(3);
        multiLevelList.head.next.child = new Node(7);
        multiLevelList.head.next.child.next = new Node(8);
        multiLevelList.head.next.child.next.child = new Node(11);
        multiLevelList.head.next.next = new Node(4);
        multiLevelList.head.next.next.next = new Node(5);
        multiLevelList.head.next.next.next.child = new Node(9);
        multiLevelList.head.next.next.next.child.next = new Node(10);

        // Display the original multilevel linked list
        System.out.println("Original Multi-level Linked List:");
        multiLevelList.display();

        // Flatten the multilevel linked list
        multiLevelList.flatten();

        // Display the flattened linked list
        System.out.println("Flattened Linked List:");
        multiLevelList.display();
    }
}
