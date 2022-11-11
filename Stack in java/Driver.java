public class Driver {
    public static void main(String[] args) {

        Stack s1 = new Stack();
        s1.push(5);
        s1.push(1);
        s1.push(7);
        s1.push(9);
        s1.push(3);
        s1.display();
        s1.peek();
        System.out.println("popped element is " + s1.pop());
        System.out.println("popped element is " + s1.pop());
        System.out.println("popped element is " + s1.pop());
        System.out.println("popped element is " + s1.pop());
        System.out.println("popped element is " + s1.pop());
        System.out.println("popped element is " + s1.pop());
    }
}