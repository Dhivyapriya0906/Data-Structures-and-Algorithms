import java.util.Arrays;
import java.util.Scanner;

public class Arr21 {

    public static void main(String[] args) {
        int arr[] = new int[]{-1, -100, 3, 99};
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int k = d % arr.length;
        int n = arr.length;
        int[] temp = Arrays.copyOfRange(arr, n - k, n);
        int j = 0;
        for (int i = k; i < n; i++) {
            int t = arr[j];
            arr[i] = arr[j];
            arr[j] = t;
            j++;
        }
        int f = 0;
        for (int i = k + 1; i < n; i++) {
            arr[i] = arr[j];
            j++;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
