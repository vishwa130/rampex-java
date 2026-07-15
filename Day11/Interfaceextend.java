package Day11;

interface A {
    void show();
}

interface B extends A {
    void display();
}

class Test implements B {

    public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }
}

public class Interfaceextend {
    public static void main(String[] args) {

        Test t = new Test();

        t.show();
        t.display();
    }
}