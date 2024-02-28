package ru.zharinov.tasks.oop.task_list_1.task03;

public class Manager implements Employee {
    private String name;
    private int salary;
    private int incomeManager;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.incomeManager = setIncomeManager();
    }

    private int setIncomeManager() {
        int maxSalary = 140000;
        int minSalary = 115000;
        maxSalary -= minSalary;
        return (int) (Math.random() * ++maxSalary) + minSalary;
    }

    @Override
    public int getMonthSalary() {
        return this.salary + (incomeManager * 5 / 100);
    }

    public int getIncomeManager() {
        return incomeManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + name +
                ", getMonthSalary=" + getMonthSalary() +
                ", monthIncomeManager=" + incomeManager +
                "}";
    }
}
