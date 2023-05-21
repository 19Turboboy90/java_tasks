package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/*
Напишите программу на Java для отображения текущей даты и времени в определенном формате.
Пример вывода:

Сейчас: 2017/06/16 08: 52: 03.066
 */
public class Task_47 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH: mm: ss.SSS");
        System.out.println("Now: " + dateFormat.format(date));
    }
}
