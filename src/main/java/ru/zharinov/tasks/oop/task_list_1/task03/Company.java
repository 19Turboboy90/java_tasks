package ru.zharinov.tasks.oop.task_list_1.task03;

import java.util.*;
import java.util.stream.Collectors;

public class Company {
    private String name;
    private int income;
    private List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void hire(Employee employee) { //	найм одного сотрудника
        employees.add(employee);
    }

    public void hireAll(Employee... arr) { //    найм нескольких сотрудников
        employees.addAll(Arrays.asList(arr));
    }

    public void fire(Employee employee) {  //	увольнение сотрудника
        employees.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {  //список самых высоких зарплат
        if (count < 0 || count > employees.size()) {
            return new ArrayList<>();
        }
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getMonthSalary))
                .limit(count)
                .collect(Collectors.toList());
    }

    public List<Employee> getLowestSalaryStaff(int count) { //список самых низких зарплат
        if (count < 0 || count > employees.size()) {
            return new ArrayList<>();
        }
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getMonthSalary).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }

    public int getSumAllSalary() { // сумма всех зарплатЛ
        return employees.stream().mapToInt(Employee::getMonthSalary).sum();
    }

    public int getIncome() { //  	получение значения дохода компании
        income = employees.stream()
                .filter(employee -> employee instanceof Manager)
                .mapToInt(employee -> ((Manager) employee).getIncomeManager()).sum();
        return income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", income=" + income +
                '}';
    }
}
