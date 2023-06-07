package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования секунд в часы, минуты и секунды.
Пример вывода:

Входные секунды: 86399
23:59:59
 */
public class Task_55 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = console.nextInt();
        System.out.println(getTime(seconds));
    }

    private static String getTime(int seconds) {
        int hour = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = minutes % 60;
        return hour + ":" + minutes + ":" + second;
    }
}
