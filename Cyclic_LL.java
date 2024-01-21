public class Cyclic_LL {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert nodes at the end
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);

        // Create a cycle for testing
        linkedList.createCycle(5);

        // Detect if there is a cycle
        boolean hasCycle = linkedList.hasCycle();

        if (hasCycle) {
            System.out.println("Linked list contains a cycle.");
        } else {
            System.out.println("Linked list does not contain a cycle.");
        }
    }
}
/* Method to create a cycle in the linked list (for testing)
void createCycle(int position) {
    if (position < 1 || position > size()) {
        System.out.println("Invalid position for creating a cycle.");
        return;
    }

    Node current = head;
    Node cycleStart = null;

    for (int i = 1; i <= position; i++) {
        if (i == position) {
            cycleStart = current;
        }
        if (i == size()) {
            current.next = cycleStart;
        }
        current = current.next;
    }
}

// Method to detect a cycle in the linked list
boolean hasCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            // Cycle detected
            return true;
        }
    }

    // No cycle detected
    return false;
}

// Method to calculate the size of the linked list
int size() {
    int count = 0;
    Node current = head;

    while (current != null) {
        count++;
        current = current.next;
    }

    return count;
}*/