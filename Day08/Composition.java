
package Day8;
class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    Engine e = new Engine();  // Composition

    void drive() {
        e.start();
        System.out.println("Car is running");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}