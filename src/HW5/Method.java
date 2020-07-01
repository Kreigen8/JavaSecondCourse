package HW5;

public class Method implements Runnable{
    static final int size = 10000000;

    @Override
    public void run() {

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i]=1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.currentTimeMillis();
        System.out.printf("\"Method1 time: \"");
        System.out.println( System.currentTimeMillis()-a);
    }
}
