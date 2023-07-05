package ru.zharinov.tasks.basic_exercises.task_list_4;

/*
Напишите программу на Java для создания строки в виде short_string + long_string + short_string из двух строк.
Строки не должны иметь одинаковую длину.
Тестовые данные: Str1 = Java
Str2 = Tutorial
Пример вывода:

JavaTutorialJava
 */
public class Task_70 {
    public static void main(String[] args) {
        String text= "Java";
        String text2= "Tutorial";
        System.out.println(text.concat(text2).concat(text));
    }
}
