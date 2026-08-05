import java.util.Scanner;

public class FibonacciCheck {

    // Function to check if a number is a perfect square
    static boolean isPerfectSquare(long n) {
        long s = (long) Math.sqrt(n);
        return s * s == n;
    }

    // Function to check if a number is Fibonacci
    static boolean isFibonacci(long n) {
        return isPerfectSquare(5 * n * n + 4) ||
               isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (isFibonacci(n))
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}