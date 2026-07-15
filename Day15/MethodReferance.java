package Day15;

interface Show {
    void display();
}

public class MethodReferance {

    static void print() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {

        Show s = MethodReferance::print;

        s.display();
    }
}