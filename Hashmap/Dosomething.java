import java.util.Scanner;

public class Dosomething {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("print the 5 elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Elements in array are");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
