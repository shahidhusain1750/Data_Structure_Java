public class Towerofhanoy {
    public static void main(String[] args) {
        int n = 3;
        towerofHanoi(n, "Source", "Auxillary", "Destination");
    }

    // making recursive method
    public static void towerofHanoi(int n, String scr, String helper, String dest) {
        int counter;
        if (n == 1) {
            System.out.println("transfer disk " + n + "from" + scr + "to" + dest);
            return;
        }
        towerofHanoi(n - 1, scr, dest, helper);
        System.out.println("transfer disk" + n + "from " + scr + "to" + dest);
        towerofHanoi(n - 1, helper, scr, dest);

    }
}
