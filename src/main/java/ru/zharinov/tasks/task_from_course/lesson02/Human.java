package ru.zharinov.tasks.task_from_course.lesson02;

public class Human implements Contestant {
    private int maxDistance = 1000;
    private int maxHeight = 20;

    @Override
    public boolean jump(int height) {
        return height > 0 && height < maxHeight;
    }

    @Override
    public boolean run(int distance) {
        return distance > 0 && distance < maxDistance;
    }
    @Override
    public String toString() {
        return "Human";
    }
}
