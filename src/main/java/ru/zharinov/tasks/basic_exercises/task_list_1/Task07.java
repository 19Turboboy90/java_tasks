package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает число в качестве входных данных и печатает свою таблицу умножения до 10.

Тестовые данные:
Введите число: 8
Ожидаемый результат :
8 х 1 = 8
8 х 2 = 16
8 х 3 = 24
...
8 х 10 = 80
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = console.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
