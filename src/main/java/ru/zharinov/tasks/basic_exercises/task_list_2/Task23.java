package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования двоичного числа в шестнадцатеричное число.
Входные данные:
Введите двоичное число: 1101
Ожидаемый результат

Шестнадцатеричное значение: D
 */
public class Task23 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 2);
        System.out.println("Hexadecimal value: " + Integer.toHexString(result).toUpperCase());
    }
}
