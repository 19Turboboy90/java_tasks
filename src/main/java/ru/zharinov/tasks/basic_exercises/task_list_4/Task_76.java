package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Arrays;

/*
Напишите программу на Java, чтобы умножить соответствующие элементы двух массивов целых чисел.
Пример вывода:

Array1: [1, 3, -5, 4]

Array2: [1, 4, -5, -2]

Результат: 1 12 25 -8
 */
public class Task_76 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        int[] result = new int[array1.length];
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        System.out.println("Result: " + Arrays.toString(result));
    }
}
