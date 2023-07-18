package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Arrays;

/*
Напишите Java-программу для создания нового массива длиной 2 из двух массивов целых чисел с тремя элементами,
и новый массив будет содержать первый и последний элементы из двух массивов.
Тестовые данные: массив1 = 50, -20, 0
массив2 = 5, -50, 10
Пример вывода:

Массив 1: [50, -20, 0]
Array2: [5, -50, 10]
Новый массив: [50, 10]
 */
public class Task_74 {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        System.out.println("array1: " + Arrays.toString(array1));
        int[] array2 = {5, -50, 10};
        System.out.println("array2: " + Arrays.toString(array2));
        int[] result = {array1[0], array2[array2.length - 1]};
        System.out.println("New array: " + Arrays.toString(result));
    }
}
