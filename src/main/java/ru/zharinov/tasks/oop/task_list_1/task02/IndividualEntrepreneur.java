package ru.zharinov.tasks.oop.task_list_1.task02;

public class IndividualEntrepreneur extends Client {
    public IndividualEntrepreneur(double amount) {
        super(amount);
    }

    @Override
    public boolean depositMoneyToBill(double money) {
        double percent = (money * 1) / 100;
        double percent2 = (money * 0.5) / 100;
        if (money < 1000 && money > 0) {
            this.amount += money - (percent);
            return true;
        }
        if (money >= 1000) {
            this.amount += money - (percent2);
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
