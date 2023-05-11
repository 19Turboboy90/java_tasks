package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования десятичного числа в восьмеричное число.

Входные данные:
Введите десятичное число: 15
Ожидаемый результат

Восьмеричное число: 17
 */
public class Task21 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 10);
        System.out.println("Octal number: " + Integer.toOctalString(result));
    }
}
