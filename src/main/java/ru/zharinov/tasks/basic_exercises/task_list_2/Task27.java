package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования восьмеричного числа в шестнадцатеричное число.
Входные данные:
Введите восьмеричное число: 100
Ожидаемый результат

Эквивалентное шестнадцатеричное число: 40
 */
public class Task27 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter any octal number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 8);
        System.out.println("Equivalent hexadecimal number: " + Integer.toHexString(result));
    }
}
