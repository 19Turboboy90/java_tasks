package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.Spliterator;

/*
1. Вывести на экран слово "JAVA", в строку, чтобы оно повторилось 10 раз, используя цикл while.
Вывод в консоль должен быть таким: JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA

2. Повторить задание 1, но используя цикл for.
 */
public class Task_82 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.print("JAVA ");
            count++;
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print("JAVA ");
        }
    }
}



