import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long maxProduct = a[0];
        long maxEnding = a[0];
        long minEnding = a[0];

        for (int i = 1; i < n; i++) {
            long x = a[i];

            long p1 = x;
            long p2 = x * maxEnding;
            long p3 = x * minEnding;

            maxEnding = Math.max(p1, Math.max(p2, p3));
            minEnding = Math.min(p1, Math.min(p2, p3));

            maxProduct = Math.max(maxProduct, maxEnding);
        }

        System.out.println(maxProduct);
    }
}