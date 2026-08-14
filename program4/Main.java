import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(freq.values());
        Collections.sort(counts, Collections.reverseOrder());

        int best = 0;

        for (int start : counts) {
            int total = 0;
            int required = start;

            for (int count : counts) {
                if (count >= required) {
                    total += required;
                    required *= 2;
                } else {
                    break;
                }
            }

            best = Math.max(best, total);
        }

        System.out.println(best);
    }
}