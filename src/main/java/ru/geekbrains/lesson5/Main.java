package ru.geekbrains.lesson5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            firstMethod();
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            secondMethod();
        });
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("END");
    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void secondMethod ()  {
        int size = 10_000_000;
        int half = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        // Создаем два массива для левой и правой части исходного
        float[] leftArr = new float[half];
        float[] rightArr = new float[half];
        // Копируем в них значения из большого массива
        System.arraycopy(arr, 0, leftArr, 0, half);
        System.arraycopy(arr, half, rightArr, 0, half);
        // Запускает два потока и параллельно просчитываем каждый малый массив
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < half; i++) {
                leftArr[i] = (float) (leftArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < half; i++) {
                float a = i + half;
                rightArr[i] = (float) (rightArr[i] * Math.sin(0.2f + (a) / 5) * Math.cos(0.2f + (a) / 5) * Math.cos(0.4f + (a) / 2));
            }
        });
        thread2.start();
        // Склеиваем малые массивы обратно в один большой
        float[] mergedArray = new float[size];
        System.arraycopy(leftArr, 0, mergedArray, 0, half);
        System.arraycopy(rightArr, 0, mergedArray, half, half);

        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }
}
