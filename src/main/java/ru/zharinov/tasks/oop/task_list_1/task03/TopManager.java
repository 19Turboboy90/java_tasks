package ru.zharinov.tasks.oop.task_list_1.task03;

public class TopManager implements Employee {
    private String name;
    private int salary;
    private Company company;

    public TopManager(String name, int salary, Company company) {
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000) {
            return salary + (salary * 150 / 100);
        }
        return salary;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "name='" + name + '\'' +
                ", salary=" + getMonthSalary() +
                '}';
    }
}
