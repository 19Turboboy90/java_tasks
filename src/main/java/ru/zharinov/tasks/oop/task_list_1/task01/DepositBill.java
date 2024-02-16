package ru.zharinov.tasks.oop.task_list_1.task01;

import java.time.LocalDateTime;

public class DepositBill extends BankAccount {
    private LocalDateTime date;

    public DepositBill(double amount) {
        super(amount);
    }

    @Override
    public boolean sendMoney(BankAccount receiver, double money) {
        if (date != date.plusMonths(3)) {
            System.out.println("Нельзя снимать деньги на протяжении трех месяцев с момента внесения их на депозит");
            return false;
        }
        return super.sendMoney(receiver, money);
    }

    @Override
    public boolean acceptMoney(BankAccount receiver, double money) {
        date = LocalDateTime.now();
        return super.acceptMoney(receiver, money);
    }

    public LocalDateTime getDate() {
        return date;
    }
}
