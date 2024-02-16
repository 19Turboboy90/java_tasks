package ru.zharinov.tasks.oop.task_list_1.task01;

public class BankAccount {
    protected double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public boolean sendMoney(BankAccount receiver, double money) {
        if (amount > money && money > 0) {
            amount = amount - money;
            double accountBalance = receiver.getAmount();
            receiver.setAmount(accountBalance + money);
            return true;
        }
        return false;
    }

    public boolean acceptMoney(BankAccount receiver, double money) {
        if (receiver.getAmount() > money && money > 0) {
            amount = amount + money;
            double remainder = receiver.getAmount() - money;
            receiver.setAmount(remainder);
            return true;
        }
        return false;
    }

    public void showAmount() {
        System.out.println("Остаток на счете: " + amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
