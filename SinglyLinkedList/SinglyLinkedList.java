public class SinglyLinkedList {

    class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        // int ptr;

        Node ptr = head;
        if (head == null) {
            System.out.println("List is Empty");
            // return;
        } else {
            System.out.println("Nodes are SinglyLinked List are");
            while (ptr != null) {
                System.out.println(ptr.data + " ");
                ptr = ptr.Next;
            }
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);
        ll.addNode(50);

        ll.display();
    }

}
