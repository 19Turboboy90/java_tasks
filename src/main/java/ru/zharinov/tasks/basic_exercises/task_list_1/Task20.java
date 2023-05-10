package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите Java-программу для преобразования десятичного числа в шестнадцатеричное число.

Входные данные:
Введите десятичное число: 15
Ожидаемый результат

Шестнадцатеричное число: F
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String num = console.nextLine();
        int result = Integer.parseInt(num, 10);
        System.out.println("Hexadecimal number: " + Integer.toHexString(result));
    }
}
