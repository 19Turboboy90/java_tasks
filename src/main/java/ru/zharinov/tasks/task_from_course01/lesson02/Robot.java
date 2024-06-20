package ru.zharinov.tasks.task_from_course01.lesson02;

public class Robot implements Contestant {
    private  int maxDistance = 1500;
    private  int maxHeight = 50;

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
        return "Robot";
    }
}
