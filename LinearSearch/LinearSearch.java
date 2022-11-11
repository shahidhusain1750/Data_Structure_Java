import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] a = new int[10];
        int i, n, search, flag = 0;
        Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();

        System.out.println("Enter the nos of Elemnts :");
        n = sc.nextInt();

        System.out.println("Enter Elements :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        System.out.println("Elemnts are :");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + "\t");

        }
        System.out.println("Enter the elements to serach :");
        search = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == search) {
                System.out.println("Element found at :" + (i + 1));
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("Elements not found.");
        }
    }
}