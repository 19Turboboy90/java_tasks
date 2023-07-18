package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Arrays;

/*
Напишите программу на Java, чтобы проверить, что данный массив целых чисел длины 2 содержит 4 или 7.
Пример вывода:

Оригинальный массив: [5, 7]
true
 */
public class Task_75 {
    public static void main(String[] args) {
        int[] array = {5, 7};
        int num = 4;
        int num2 = 7;
        System.out.println(Arrays.stream(array).anyMatch(j -> num == j || num2 == j));
    }
}
