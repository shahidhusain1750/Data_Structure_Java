
public class SinglyLinkedList {
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node ptr = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            System.out.println("Nodes of Singly Linked list :");
            while (ptr != null) {
                // prints each node by increament pointer
                System.out.println(ptr.data + " ");
                ptr = ptr.next;
            }
            System.out.println();
        }
    }
}
