package ru.zharinov.tasks.oop.task_list_1.task02;

public abstract class Client {
    protected double amount;

    public Client(double amount) {
        this.amount = amount;
    }

    public abstract boolean depositMoneyToBill(double money);

    public abstract boolean takeMoneyFromBill(double money);

    public void accountInformation() {
        System.out.println("Остаток на счете: " + amount);
        System.out.println("•\tУ физических лиц пополнение и снятие происходит без комиссии.\n " +
                "•\tУ юридических лиц — снятие с комиссией 1%.\n" +
                "•\tУ ИП — пополнение с комиссией 1%, если сумма меньше 1000 рублей. " +
                "И с комиссией 0,5%, если сумма больше либо равна 1000 рублей.");
    }
}
