package ru.zharinov.tasks.basic_exercises.task_list_4;

/*
В 1626 году индейцы продали Манхэттен за 24$.
Написать программу, которая высчитывает сумму, получившуюся в текущем году, если бы индейцы положили эти деньги в банк
под 5% годовых.
 */
public class Task_80 {
    public static void main(String[] args) {
        double sum = sum(24);
        System.out.println(sum);
    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2023; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + " : " + result);
        }
        return result;
    }
}
