import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int result = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                if (result == 0) {
                    result = freq[i];
                } else {
                    result = gcd(result, freq[i]);
                }
            }
        }

        System.out.println(result);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}