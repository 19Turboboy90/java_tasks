package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает два целочисленных значения от пользователя и возвращает большие значения.
Однако, если два значения одинаковы, вернуть 0 и вернуть меньшее значение, если два значения имеют
одинаковый остаток при делении на 6. Перейти к редактору
Пример вывода:

Введите первое число: 12
Введите второе число: 13
Результат: 13
 */
public class Task_63 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();
        System.out.println(compare(num1, num2));
    }

    private static int compare(int number1, int number2) {
        if (number1 % 6 == (number2 % 6)) {
            return Math.min(number1, number2);
        } else if (number1 == number2) {
            return 0;
        } else {
            return Math.max(number1, number2);
        }
    }
}
