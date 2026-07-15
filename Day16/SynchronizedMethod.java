package Day16;

class Table {

    synchronized void print() {

        System.out.println("Synchronized Method");
    }
}

public class SynchronizedMethod {

    public static void main(String[] args) {

        Table t = new Table();

        t.print();
    }
}
