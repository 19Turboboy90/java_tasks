package ru.zharinov.tasks.basic_exercises.task_list_1;

/*
Напишите программу на Java для замены двух переменных.
 */
public class Task15 {
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 10;
        System.out.println("a = " + a + "\n" + "b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + "\n" + "b = " + b);
    }
}
