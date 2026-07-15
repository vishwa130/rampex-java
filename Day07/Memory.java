package Day7;
import java.util.Scanner;

class Student {
    int age;
}

public class Memory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter age: ");
        s.age = sc.nextInt();

        System.out.println("Age = " + s.age);

        sc.close();
    }
}