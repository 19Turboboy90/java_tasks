package ru.zharinov.tasks.task_from_course.lesson02;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean action(Contestant contestant) {
        if (contestant.run(length)) {
            System.out.println("Забег успешен у " + contestant.toString());
            return true;
        } else {
            System.out.println("Забег не получился у " + contestant.toString());
            return false;
        }
    }
}
