import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        K = K % N;

        for (int i = K; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < K; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}