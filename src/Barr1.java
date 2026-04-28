import java.util.*;
public class Barr1 {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};

            // Traversal
            System.out.println("Traversal:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            // Prefix Sum
            int[] prefix = new int[arr.length];

            // First element
            prefix[0] = arr[0];

            // Build prefix array
            for (int i = 1; i < arr.length; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }

            System.out.println("\nPrefix Sum:");
            for (int val : prefix) {
                System.out.print(val + " ");
            }

            // Range Sum Example (L = 1, R = 3)
            int L = 1, R = 3;

            int sum;
            if (L == 0) {
                sum = prefix[R];
            } else {
                sum = prefix[R] - prefix[L - 1];
            }

            System.out.println("\nSum from index " + L + " to " + R + " = " + sum);
        }
    }

