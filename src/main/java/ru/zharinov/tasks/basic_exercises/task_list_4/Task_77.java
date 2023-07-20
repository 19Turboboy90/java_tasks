package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Arrays;

/*
Напишите программу на Java для объединения двух заданных отсортированных массивов целых чисел и
создания нового отсортированного массива.
массив1 = [1,2,3,4]
массив2 = [2,5,7, 8]
результат = [1,2,2,3,4,5,7,8]
 */
public class Task_77 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array2.length, array2.length);
        Arrays.sort(result);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
