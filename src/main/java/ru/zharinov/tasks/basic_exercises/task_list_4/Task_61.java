package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Scanner;

/*
Напишите программу на Java, чтобы перевернуть слово.
Пример вывода:

Введите слово: тсаФ
Обратное слово: Фаст
 */
public class Task_61 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the word(s): ");
        String text = console.nextLine();
        StringBuilder revert = new StringBuilder();
        System.out.println(revert.append(text).reverse());
    }
}
