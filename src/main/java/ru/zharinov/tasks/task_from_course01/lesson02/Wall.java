package ru.zharinov.tasks.task_from_course01.lesson02;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean action(Contestant contestant) {
        if (contestant.jump(height)) {
            System.out.println("Прыжок успешен у " + contestant.toString());
            return true;
        } else {
            System.out.println("Прыжок не получился у " + contestant.toString());
            return false;
        }
    }
}
