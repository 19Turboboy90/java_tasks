package ru.zharinov.tasks.task_from_course.lesson04.fruits;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
