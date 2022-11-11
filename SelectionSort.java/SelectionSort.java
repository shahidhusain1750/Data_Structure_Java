import java.util.Scanner;

public class SelectionSort {

    public static void SelectionSort(int a[], int n) {
        int j, pos, temp;

        for (j = 0; j < n; j++) {
            System.out.println("pass \t" + (j + 1));
            pos = smallest(a, j, n);
            System.out.println("pos \t" + pos);

            temp = a[j];
            a[j] = a[pos];
            a[pos] = temp;
            display(a, n);

        }
    }

    private static int smallest(int a[], int j, int n) {
        int pos = j;
        int small = a[j];
        int i;

        for (i = j + 1; i < n; i++) {
            if (a[i] < small) {
                small = a[i];
                pos = i;
            }
        }

        return pos;
    }

    public static void display(int[] a, int n) {
        System.out.println("Elements in array are :\t");
        System.out.println("After Elements are Sorted");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "\t");
        }
        System.out.println("\t");
    }

    public static void main(String args[]) {
        int a[] = new int[10];
        int n, i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        n = sc.nextInt();

        System.out.println("Enter the number of elements :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        display(a, n);
        SelectionSort(a, n);
        display(a, n);
    }
}