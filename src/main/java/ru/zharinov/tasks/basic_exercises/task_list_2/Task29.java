package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования шестнадцатеричного числа в двоичное число.
Входные данные:
Введите шестнадцатеричное число: 37
Ожидаемый результат

Эквивалентный двоичный номер: 110111
 */
public class Task29 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 16);
        System.out.println("Equivalent binary number: " + Integer.toBinaryString(result));
    }
}
