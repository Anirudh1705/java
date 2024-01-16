public class Givenposition_LL {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert nodes at various positions
        linkedList.insertAtPosition(1, 1);
        linkedList.insertAtPosition(3, 2);
        linkedList.insertAtPosition(5, 1);

        // Display the initial linked list
        System.out.println("Linked List:");
        linkedList.display();

        // Remove from a specific position
        linkedList.removeFromPosition(2);

        // Display the linked list after removal
        System.out.println("Linked List after removing from position 2:");
        linkedList.display();
    }
}
