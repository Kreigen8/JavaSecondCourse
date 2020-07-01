package HW5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Method());
        t1.start();
        t1.join();

        Thread t2 = new Thread(new Method2());
        t2.start();
    }
}
