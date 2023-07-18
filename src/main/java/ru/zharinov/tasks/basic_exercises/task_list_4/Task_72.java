package ru.zharinov.tasks.basic_exercises.task_list_4;


/*
Напишите программу на Java, чтобы проверить, является ли 10 первым или последним элементом массива целых чисел.
Длина массива должна быть больше или равна 2.
Пример вывода:
Данные испытаний: массив = 10, -20, 0, 30, 40, 60, 10

true
 */
public class Task_72 {
    public static void main(String[] args) {
        int[] array = {10, -0, 0, 30, 40, 60, 10, 15};
        int number = 10;
        System.out.println(search(number, array));
    }

    private static boolean search(int num, int[] array) {
        return array[0] == num || array[array.length - 1] == num;
    }
}
