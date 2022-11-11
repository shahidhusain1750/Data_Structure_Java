class Outer {
    int Outer_x = 100;

    void test() {
        Inner in = new Inner();
        in.display();
    }

    class Inner {
        void display() {
            System.out.println("Display of inner class" + Outer_x);
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.test();
    }
}