package ru.zharinov.tasks.task_from_course.lesson06;

import java.util.Arrays;

/*
1. Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
static final int SIZE = 10 000 000;
static final int HALF = size / 2;
float[] arr = new float[size].
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
Math.cos(0.4f + i / 2)).
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
Отличие первого метода от второго:
● Первый просто бежит по массиву и вычисляет значения.
● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.
Пример деления одного массива на два:
● System.arraycopy(arr, 0, a1, 0, h);
● System.arraycopy(arr, h, a2, 0, h).
© ВТБ совместно с GeekBrains
7
Пример обратной склейки:
● System.arraycopy(a1, 0, arr, 0, h);
● System.arraycopy(a2, 0, arr, h, h).
Примечание:
System.arraycopy() — копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек
копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:
for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
Math.cos(0.4f + i / 2));
}
Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и
склейки.
 */
public class Main {
    public static final int SIZE = 10_000_000;
    public static final int HALF = SIZE / 2;
    public static float[] array = new float[SIZE];

    public static void main(String[] args) {
        getTimeWithoutConcurrency();
        getTimeWithConcurrency();
    }

    private static void getTimeWithoutConcurrency() {
        Arrays.fill(array, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            float index = (float) i;
            array[i] = (float) (array[i] * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5)
                    * Math.cos(0.4f + index / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }


    private static void getTimeWithConcurrency() {
        Arrays.fill(array, 1);
        long a = System.currentTimeMillis();
        float[] array1 = new float[HALF];
        float[] array2 = new float[HALF];
        System.arraycopy(array, 0, array1, 0, HALF);
        System.arraycopy(array, HALF, array2, 0, HALF);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < array1.length; i++) {
                float index = (float) i;
                array1[i] = (float) (array[i] * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5)
                        * Math.cos(0.4f + index / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < array2.length; i++) {
                float index = (float) (i + SIZE / 2);
                array2[i] = (float) (array[i] * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5)
                        * Math.cos(0.4f + index / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(array1, 0, array, 0, HALF);
        System.arraycopy(array2, 0, array, HALF, HALF);
        System.out.println(System.currentTimeMillis() - a);
    }
}
