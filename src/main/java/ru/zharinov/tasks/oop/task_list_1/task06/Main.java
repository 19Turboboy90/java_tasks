package ru.zharinov.tasks.oop.task_list_1.task06;

public class Main {
    public static void main(String[] args) {
        SnilsValidatorImpl snilsValidator = new SnilsValidatorImpl();
        System.out.println(new SnilsValidatorImpl().validate("90114404441"));
    }
}
