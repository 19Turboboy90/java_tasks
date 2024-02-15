package ru.zharinov.tasks.task_from_course.lesson03.exceptions;

public class MyArrayDataException extends MyException {
    private int i;
    private int j;
    private String value;

    public MyArrayDataException(int i, int j, String[][] array) {
        super("В ячейки массива [" + j + " : " + i + "]: лежит не число: " + array[j][i]);
        this.i = i;
        this.j = j;
        this.value = array[j][i];
    }
}
