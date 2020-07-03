package HW5;

public class Method2 {
    static final int size = 10000000;
    static final int h = size / 2;

    public void run() {

        float[] arr = new float[size];
        float[] arr2 = new float[h];
        float[] arr3 = new float[h];

        for (int i = 0; i < size; i++) {
            arr[i]=1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr2, 0, h);
        System.arraycopy(arr, h, arr3, 0, h);

        Thread t1 = new Thread(()->{
           for (int i = 0; i < h; i++) {
                arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < h; i++) {
                arr3[i] = (float)(arr3[i] * Math.sin(0.2f + (h+i) / 5) * Math.cos(0.2f + (h+i) / 5) * Math.cos(0.4f + (h+i) / 2));
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr2, 0, arr, 0, h);
        System.arraycopy(arr3, 0, arr, h, h);

        System.currentTimeMillis();
        System.out.printf("\"Method2 time: \"");
        System.out.println(System.currentTimeMillis()-a);
    }
}
