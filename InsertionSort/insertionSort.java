import java.util.Scanner;

public class insertionSort {
    public static void insertionsort(int[] a, int n) {
        int i, j, temp;

        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;
            while ((j >= 0) && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void display(int a[], int n) {
        System.out.println("Elements in array are :");
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        int i, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        n = sc.nextInt();

        System.out.println("Enter the number of elements :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        display(a, n);
        insertionsort(a, n);
        display(a, n);
    }
}