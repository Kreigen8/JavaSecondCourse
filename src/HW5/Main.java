package HW5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread method1 = new Thread(new Method());
        method1.run();
        method1.join();

        Thread method2 = new Thread(new Method2());
        method2.run();
    }
}
