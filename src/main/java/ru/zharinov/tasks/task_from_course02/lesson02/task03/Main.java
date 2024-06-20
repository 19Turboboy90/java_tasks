package ru.zharinov.tasks.task_from_course02.lesson02.task03;

public class Main {
    public static void main(String[] args) {
        SnilsValidatorImpl snilsValidator = new SnilsValidatorImpl();
        System.out.println(new SnilsValidatorImpl().validate("90114404441"));
    }
}
