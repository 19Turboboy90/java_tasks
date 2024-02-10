package ru.zharinov.tasks.task_from_course.lecture_1.animals;

public abstract class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public static int count;


    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int distance) {
        if (distance >= 0 && distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + "м.");
        } else {
            System.out.println(name + " не смог пробежать");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
            return;
        }
        if (distance >= 0 && distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + "м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + "м.");
        }
    }
}
