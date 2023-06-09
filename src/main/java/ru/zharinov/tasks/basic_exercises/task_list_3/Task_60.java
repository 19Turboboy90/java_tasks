package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, чтобы найти предпоследнее (рядом с последним) слово предложения.
Пример вывода:

Введите строку: быстрая коричневая лиса перепрыгивает через ленивую собаку.
Предпоследнее слово: ленивую
 */
public class Task_60 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = console.nextLine();
        String[] array = text.split(" ");
        text = array[array.length - 2];
        System.out.println("Penultimate word: " + text);
    }
}
