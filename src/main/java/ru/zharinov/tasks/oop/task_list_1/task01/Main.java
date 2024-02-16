package ru.zharinov.tasks.oop.task_list_1.task01;

/*
1. Создайте класс BankAccount, который представляет собой расчётный счёт в банке. У класса необходимо написать методы:
     a. Снять со счёта сумму денег (без комиссии).
     b. Вносить на счёт сумму денег (без комиссии).
     c. Получить остаток на счёте.
2. Создайте два класса наследника, расширяющие работу с остатком на счёте:
•	Депозитный расчётный счёт, с которого нельзя снимать деньги в течение месяца после последнего внесения.
•	Карточный счёт, при снятии денег с которого будет взиматься комиссия 1%.

Дополнительное задание*
Цель задания
Потренироваться в написании взаимодействия между классами.
Что нужно сделать
Напишите метод в классе BankAccount:
boolean send(BankAccount receiver, double amount)
для отправки денег с одного счёта на другой. Метод должен вернуть true, если деньги успешно переведены.
Примечание
В методе для аргумента amount используйте тип данных, который применили в классе BankAccount. Тип double дан для примера.

 */
public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(10000);
        BankAccount anotherBankAccount2 = new BankAccount(10000);
        CreditCardBill creditCardBill = new CreditCardBill(12000);
        CreditCardBill creditCardBill2 = new CreditCardBill(12000);
        DepositBill depositBill = new DepositBill(10000);
        System.out.println(depositBill.getAmount());
        System.out.println(myBankAccount.getAmount());
        depositBill.acceptMoney(myBankAccount, 1000);
        System.out.println(depositBill.getAmount());
        System.out.println(myBankAccount.getAmount());
        depositBill.sendMoney(myBankAccount, 1000);
        System.out.println(depositBill.getAmount());
        System.out.println(myBankAccount.getAmount());

        System.out.println("--------------------------------");
        creditCardBill.showAmount();
        creditCardBill2.showAmount();
        creditCardBill.sendMoney(creditCardBill2, 1000);
        creditCardBill.showAmount();
        creditCardBill2.showAmount();
        System.out.println("--------------------------------");
        creditCardBill.showAmount();
        myBankAccount.showAmount();
        creditCardBill.sendMoney(myBankAccount, 1000);
        creditCardBill.showAmount();
        myBankAccount.showAmount();
        System.out.println("--------------------------------");
    }
}
