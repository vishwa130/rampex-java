package Day15;

import java.util.Arrays;

public class TerminalOperation {

    public static void main(String[] args) {

        int sum = Arrays.asList(10,20,30)
                        .stream()
                        .mapToInt(i -> i)
                        .sum();

        System.out.println(sum);
    }
}