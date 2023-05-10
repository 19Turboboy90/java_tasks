package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования десятичного числа в двоичное число.

Входные данные:
Введите десятичное число: 5
Ожидаемый результат

Двоичный номер: 101
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String first = console.nextLine();
        int num = Integer.parseInt(first, 10);
        System.out.println("Binary number: " + Integer.toBinaryString(num));
    }
}
