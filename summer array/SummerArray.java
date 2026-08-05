import java.util.*;

public class SummerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long leftEven = 0;
        int evenPos = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                leftEven += Math.abs(i - evenPos);
                evenPos++;
            }
        }

        long leftOdd = 0;
        int oddPos = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] % 2 != 0) {
                leftOdd += Math.abs(i - oddPos);
                oddPos++;
            }
        }

        System.out.println(Math.min(leftEven, leftOdd));
    }
}