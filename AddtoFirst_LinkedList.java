public class AddtoFirst_LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Append nodes to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.addToFirst(0);
        linkedList.addToFirst(15);
        System.out.println("Linked List:");
        linkedList.display();
    }
}