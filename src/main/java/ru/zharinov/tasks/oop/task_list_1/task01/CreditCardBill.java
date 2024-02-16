package ru.zharinov.tasks.oop.task_list_1.task01;

public class CreditCardBill extends BankAccount {
    public CreditCardBill(double amount) {
        super(amount);
    }

    @Override
    public boolean sendMoney(BankAccount receiver, double money) {
        double percent = (money * 1) / 100;
        if (amount + percent > money && money > 0) {
            amount = amount - (money + percent);
            double accountBalance = receiver.getAmount();
            receiver.setAmount(accountBalance + (money + percent));
            return true;
        }
        return false;
    }

    @Override
    public boolean acceptMoney(BankAccount receiver, double money) {
        double percent = (money * 1) / 100;
        if (receiver.getAmount() + percent > money && money > 0) {
            amount = amount + (money + percent);
            double remainder = receiver.getAmount() - (money + percent);
            receiver.setAmount(remainder);
            return true;
        }
        return false;
    }
}
