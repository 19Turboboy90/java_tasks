package ru.zharinov.tasks.task_from_course.lecture_1.animal;

public class HomeCat extends Animal {
    public HomeCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 10) {
            super.run(distance);
        } else {
            System.out.println(getName() + " не смог пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }
}
