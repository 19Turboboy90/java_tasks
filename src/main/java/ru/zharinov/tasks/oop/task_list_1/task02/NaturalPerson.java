package ru.zharinov.tasks.oop.task_list_1.task02;

public class NaturalPerson extends Client {
    public NaturalPerson(double amount) {
        super(amount);
    }

    @Override
    public boolean depositMoneyToBill(double money) {
        if (money > 0) {
            this.amount += money;
            return true;
        }
        System.out.println("Вы ввели некорректную сумму");
        return false;
    }

    @Override
    public boolean takeMoneyFromBill(double money) {
        if (money > 0) {
            this.amount -= money;
            return true;
        }
        System.out.println("Вы ввели некорректную сумму");
        return false;
    }
}
