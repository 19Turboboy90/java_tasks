package ru.zharinov.tasks.task_from_course01.lesson01.animals;

public class HomeCat extends Animal {
    public static int count;

    public HomeCat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        count++;
    }
}
