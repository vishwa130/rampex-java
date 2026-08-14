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

        Arrays.sort(A);

        int left = 0;
        int right = N - 1;
        boolean found = false;

        while (left < right) {
            int sum = A[left] + A[right];

            if (sum == K) {
                System.out.print(A[left] + " " + A[right] + " ");
                found = true;

                int leftValue = A[left];
                int rightValue = A[right];

                while (left < right && A[left] == leftValue) {
                    left++;
                }

                while (left < right && A[right] == rightValue) {
                    right--;
                }

            } else if (sum < K) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.print("-1");
        }

        sc.close();
    }
}