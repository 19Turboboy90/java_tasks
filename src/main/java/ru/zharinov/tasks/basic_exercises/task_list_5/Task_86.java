package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.Arrays;
import java.util.Collections;

/*
Задание №1
Что нужно сделать
1. Создайте массив из мнемонической фразы:
Каждый охотник желает знать, где сидит фазан.
2. Напишите код, который меняет порядок расположения элементов внутри массива на обратный.

Пример
Первоначальный массив: [“a”, “b”, “c”, “d”].
Массив с элементами в обратном порядке: [“d”, “c”, “b”, “a”].

Задание №2
Что нужно сделать
1.	Создайте массив типа float с температурами 30 пациентов (от 32 до 40 градусов).
2.	Напишите код, который выводит среднюю температуру по больнице и количество здоровых пациентов
(с температурой от 36,2 до 36,9), а также температуры всех пациентов.

Пример
Температуры пациентов: 36.7 38.9 34.7
Средняя температура: 36.76
Количество здоровых: 1


Дополнительное задание*
Цель задания
Закрепить навыки работы с массивами, используя двумерный массив.
Что нужно сделать
Создайте с помощью циклов двумерный массив строк. При его распечатке в консоли должен выводиться крестик из X:

x     x
 x   x
  x x
   x
  x x
 x   x
x     x


 */
public class Task_86 {
    private static final float MAX_TEMPERATURE_HEALTHIER_PATIENTS = 36.9f;
    private static final float MIN_TEMPERATURE_HEALTHIER_PATIENTS = 36.2f;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        String[] array = {"Каждый", "охотник", "желает", "знать,", "где", "сидит", "фазан" };
        String[] newArray = new String[array.length];
        int tmp = 0;
        for (int i = array.length - 1; i >= 0; i--) { // Вариант 1
            newArray[tmp] = array[i];
            tmp++;
        }
        System.out.println(Arrays.toString(newArray));
//-------------------------------------------------------------------------
        Collections.reverse(Arrays.asList(array)); //Вариант 2
        System.out.println(Arrays.toString(array));
    }

    private static void task2() {
        float[] array = {32.9f, 33.9f, 34.9f, 35.9f, 36.9f, 37.9f, 38.9f, 39.9f, 40.0f, 36.9f,
                32.0f, 33.0f, 34.0f, 35.0f, 36.0f, 37.0f, 38.0f, 39.0f, 40.0f, 36.0f,
                32.5f, 33.5f, 34.5f, 35.5f, 36.5f, 37.5f, 38.5f, 39.5f, 40.0f, 36.5f};
        float avg = 0.0f;
        int countHealthy = 0;
        for (float v : array) {
            avg += v;
            if (v <= MAX_TEMPERATURE_HEALTHIER_PATIENTS && v >= MIN_TEMPERATURE_HEALTHIER_PATIENTS) {
                countHealthy++;
            }
        }

        System.out.println("Температура все пациентов: " + Arrays.toString(array));
        System.out.println("Средняя температура: " + Math.round((avg / array.length) * 10.0) / 10.0);
        System.out.println("Количество здоровых пациентов " + countHealthy);
    }

    private static void task3() {
        String[][] array = new String[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (j == i || j == array.length - 1 - i) ? "x" : " ";
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
