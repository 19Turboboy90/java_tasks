package ru.zharinov.tasks.oop.task_list_1.task03;

public class Operator implements Employee {

    private String name;
    private int salary;

    public Operator(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
