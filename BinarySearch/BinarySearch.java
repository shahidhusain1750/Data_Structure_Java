import java.util.Scanner;

class BinarySearch {
    public static void main(String args[]) {
        int arr[];
        int low, mid, high;
        int i, n, search;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter number of integers :" + n);

        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter value to find");
        search = sc.nextInt();

        low = 0;
        high = n - 1;
        mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < search)
                low = mid + 1;
            else if (arr[mid] == search) {
                System.out.println(search + " found at location " + (mid + 1) + ".");
                break;
            } else
                high = mid - 1;
            mid = (low + high) / 2;
        }
        if (low > high)
            System.out.println(search + " isn't present in the list.\n");
    }
}