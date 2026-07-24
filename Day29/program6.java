package Day30;

public class Program6 {
    public static void main(String[] args) {

        int coins[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 2893;

        System.out.println("Coins Used:");

        for (int coin : coins) {
            while (amount >= coin) {
                System.out.print(coin + " ");
                amount -= coin;
            }
        }
    }
}
    