package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Date;

/*
Напишите программу на Java для отображения системного времени.
Пример вывода:

Текущее время: пятница, июнь 16 14:17:40 IST 2017
 */
public class Task_46 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}
