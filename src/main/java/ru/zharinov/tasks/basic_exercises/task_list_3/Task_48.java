package ru.zharinov.tasks.basic_exercises.task_list_3;
/*
Напишите программу на Java для печати нечетных чисел от 1 до 99. Печатает по одному числу в строке.
Пример вывода:

1
3
5
7
9
11
....

91
93
95
97
99
 */
public class Task_48 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
