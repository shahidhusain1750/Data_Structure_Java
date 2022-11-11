public class Stack {

    private static final int MAX = 5;

    int[] st = new int[MAX];
    int top = -1;

    public void push(int val) {
        if (top == MAX - 1) {
            System.out.println("Stack is full overflow condition");
        } else {
            top++;
            st[top] = val;
            System.out.println("Element inserted sucessfully" + " " + val);
        }
    }

    public int pop() {
        int val;
        if (top == -1) {
            System.out.println(" Underflow condition");
            return -1;
        } else {

            val = st[top];
            top--;
            return val;

        }

    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println("peeked element is " + st[top]);
            return st[top];
        }

    }

    public void display() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println("elements in the stack are ");
            for (int i = top; i >= 0; i--) {
                System.out.println(st[i]);
            }
        }
    }
}
