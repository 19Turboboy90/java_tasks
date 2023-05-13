package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для обращения строки.
Входные данные:
Введите строку: быстрый коричневый лис
Ожидаемый результат

Обратная строка: сил йывенчирок йыртсыб
 */
public class Task37 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String line = console.nextLine();
        System.out.println("Reverse line: " + new StringBuilder(line).reverse());
    }
}
