package ru.zharinov.tasks.basic_exercises.task_list_1;

/*
Напишите программу на Java для печати лица.
Ожидаемый результат

 + "" "" "+
[| оо |]
 | ^ |
 | '-' |
 + ----- +
 */
public class Task16 {
    public static void main(String[] args) {
        String[] face = new String[5];
        face[0] = "+ \"\"\"\"\" +";
        face[1] = "[| о о |]";
        face[2] = " |  ^  |  ";
        face[3] = " | '-' | ";
        face[4] = "+ ----- +";

        for (String s : face) {
            System.out.println(s);
        }
    }
}
