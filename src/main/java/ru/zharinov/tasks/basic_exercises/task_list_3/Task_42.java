package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.io.Console;
import java.util.Scanner;

/*
Напишите программу на Java для ввода и отображения вашего пароля.
Ожидаемый результат

Введите ваш пароль:
Ваш пароль был: abc@123
 */
public class Task_42 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = console.nextLine();
        System.out.println("Your password was: " + password);
    }
}
