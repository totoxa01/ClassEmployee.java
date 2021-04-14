package ru.geekbrains.pr12;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 14.04.2021
 */
public class ClassWork {
     static final int SIZE = 10000000;
     static final int HALF = SIZE / 2;

    public float[] calculation(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        return arr;
    }

    public void firstMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        calculation(arr);
        System.currentTimeMillis();
        System.out.println("Первый метод заканчивает: " + (System.currentTimeMillis() - a));
    }

    public void secondMethod() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 1.0f;
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        new Thread() {
            public void run() {
                float[] a1 = calculation(arr1);
                System.arraycopy(a1, 0, arr1, 0, a1.length);
            }
        }.start();

        new Thread() {
            public void run() {
                float[] a2 = calculation(arr2);
                System.arraycopy(a2, 0, arr2, 0, a2.length);
            }
        }.start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.out.println("Второй метод заканчивает: " + (System.currentTimeMillis() - a));
    }

    public static void main(String s[]) {
        ClassWork cw=new ClassWork();
        cw.firstMethod();
        cw.secondMethod();
    }
}
