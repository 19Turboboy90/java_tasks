package ru.zharinov.tasks.task_from_course.lecture_1.animal;

public class Animal {
    private String name;
    private int age;
    private static int amount;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        amount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void amount() {
        System.out.println("Число созданных животных: " + amount);
    }

    public void run(int distance) {
        System.out.println(getName() + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(getName() + " проплыл " + distance + " м.");
    }
}
