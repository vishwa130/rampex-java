package Day7;
import java.util.Scanner;
public class Shadowing {
    
    int num = 100;

    void show(int num) {
        System.out.println("Local Variable = " + num);
        System.out.println("Instance Variable = " + this.num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shadowing s = new Shadowing();

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        s.show(n);

        sc.close();
    }
}

