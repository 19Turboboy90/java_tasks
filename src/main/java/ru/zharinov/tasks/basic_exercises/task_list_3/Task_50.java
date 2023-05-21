package ru.zharinov.tasks.basic_exercises.task_list_3;

/*
Напишите программу на Java для печати чисел от 1 до 100, которые делятся на 3, 5 и оба.
Пример вывода:

Разделенный на 3:
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Разделенный на 5:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
95,

Разделенный на 3 и 5:
15, 30, 45, 60, 75, 90,
 */
public class Task_50 {
    public static void main(String[] args) {
        System.out.print("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n\nDivided by 3 and 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
