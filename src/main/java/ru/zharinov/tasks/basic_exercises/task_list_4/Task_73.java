package ru.zharinov.tasks.basic_exercises.task_list_4;

/*
Напишите программу на Java, чтобы проверить, совпадают ли первый и последний элемент двух массивов целых чисел.
Длина массива должна быть больше или равна 2.
Данные испытаний: массив1 = 50, -20, 0, 30, 40, 60, 12
массив2 = 45, 20, 10, 20, 30, 50, 11
Пример вывода:

false
 */
public class Task_73 {
    public static void main(String[] args) {
        int[] array = {50, -20, 0, 30, 40, 60, 10};
        int number = 10;
        System.out.println(search(number, array));
    }

    private static boolean search(int num, int[] array) {
        return array[0] == num && array[array.length - 1] == num;
    }
}
