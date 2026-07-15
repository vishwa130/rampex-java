package Day8;

interface Vehicle {
    void run();
}
class Bike implements Vehicle {

    public void run() {
        System.out.println("Bike is running");
    }
}

public class Interface {
    public static void main(String[] args) {

        Bike b = new Bike();

        b.run();
    }
}
