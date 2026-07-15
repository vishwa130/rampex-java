package Day7;
import java.util.Scanner;

public class Oopsdemo {

    int number;

    void display() {
        System.out.println("Number = " + number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Oopsdemo obj = new Oopsdemo();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.display();

        sc.close();
    }
}