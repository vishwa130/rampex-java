package Day15;

interface Demo {
    void show();
}

class Test {

    void display() {
        System.out.println("Instance Method");
    }
}

public class ClassMethodReferance {

    public static void main(String[] args) {

        Test t = new Test();

        Demo d = t::display;

        d.show();
    }
}