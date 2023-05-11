package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования шестнадцатеричного числа в восьмеричное число.
Входные данные:
Введите шестнадцатеричное число: 40
Ожидаемый результат

Эквивалент восьмеричного числа: 100
 */
public class Task30 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 16);
        System.out.println("The equivalent of an octal number: " + Integer.toOctalString(result));
    }
}
