import java.util.*;

public class Main {

    static int minChanges(int[] a) {
        int n = a.length;
        int best = n;

        for (int peak = 0; peak < n; peak++) {
            int changes = 0;

            for (int i = 0; i < n; i++) {
                int expected = a[peak] - Math.abs(i - peak);

                if (a[i] != expected) {
                    changes++;
                }
            }

            best = Math.min(best, changes);
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(minChanges(a));
    }
}  
}
