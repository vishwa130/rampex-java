package Day11;
interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interface {
    public static void main(String[] args) {

        // Animal a = new Animal(); ❌ Not possible

        Dog d = new Dog();
        d.sound();
    }
}