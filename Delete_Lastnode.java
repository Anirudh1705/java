class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;
    void addToFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }
    void deleteLastNode() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.print("Null");
    }

}

public class Delete_Lastnode {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

      // Append nodes to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
      /*  linkedList.addToFirst(0);
        linkedList.addToFirst(15);
       */
        System.out.println("Linked List:");
        linkedList.display();

       /* linkedList.deleteLastNode();

        System.out.println("Linked List after deleting the last node:");
        linkedList.display();
        */
    }
}
