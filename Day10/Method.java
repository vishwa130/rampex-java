package Day10;

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class Method {

    public static void main(String[] args) {

        Animal a = new Animal();

        a.sound();
    }
}