package HW5;

public class Method{
    static final int size = 10000000;

    public void run() {

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i]=1;
        }

        long a = System.currentTimeMillis();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < size; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        t1.run();

        System.currentTimeMillis();
        System.out.printf("\"Method1 time: \"");
        System.out.println( System.currentTimeMillis()-a);
    }
}
