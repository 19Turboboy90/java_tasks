package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования двоичного числа в восьмеричное число.
Входные данные:
Введите двоичное число: 111
Ожидаемый результат

Восьмеричное число: 7
 */
public class Task24 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 2);
        System.out.println("Octal number: " + Integer.toOctalString(result));
    }
}
