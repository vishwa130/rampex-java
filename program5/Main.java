import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {

            // Remove elements outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - K) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && A[dq.peekLast()] <= A[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // Print maximum for each complete window
            if (i >= K - 1) {
                System.out.print(A[dq.peekFirst()] + " ");
            }
        }

        sc.close();
    }
}