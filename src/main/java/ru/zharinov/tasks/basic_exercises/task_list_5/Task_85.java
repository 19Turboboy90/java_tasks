package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.Scanner;

/*
Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
Вывести все числа из диапазона между a и b, которые делятся на 5 без остатка, но при этом не делится на 10 без остатка.
Например, число 15 подходит под наше условие (делится на 5 без остатка и не делится на 10 без остатка), но число 20
не подходит под наше условие (делится на 5 без остатка и делится на 10 без остатка).
Сами числа a и b в диапазоне не учитывается.

Пример: Вводим в консоль: 7 78
Вывод: 15 25 35 45 55 65 75
 */
public class Task_85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
