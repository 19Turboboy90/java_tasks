package ru.zharinov.tasks.task_from_course.lecture_1.animals;

public class Tiger extends Animal {
    public static int count;

    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
