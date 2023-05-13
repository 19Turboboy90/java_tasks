package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.*;

/*
Напишите программу на Java для создания и отображения уникального трехзначного числа, используя 1, 2, 3, 4.
Также подсчитайте, сколько существует трехзначных чисел.
Ожидаемый результат

123
124
...
431
432

Общее количество трехзначных чисел - 24
 */
public class Task39 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        count++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + count);
    }
}
