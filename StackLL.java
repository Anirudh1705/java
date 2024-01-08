class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to the stack");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }

        int poppedValue = top.data;
        top = top.next;
        System.out.println(poppedValue + " popped from the stack");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return;
        }

        System.out.println("Top element: " + top.data);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
public class StackLL {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();
        stack.display();

        stack.peek();
    }
}