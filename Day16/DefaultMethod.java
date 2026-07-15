package Day16;

interface Demo {

    default void show() {

        System.out.println("Default Method");
    }
}

public class DefaultMethod implements Demo {

    public static void main(String[] args) {

        DefaultMethod d = new DefaultMethod();

        d.show();
    }
}