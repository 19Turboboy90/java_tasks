package ru.zharinov.tasks.oop.task_list_1.task02;

/*
Что нужно сделать
1. Создайте классы, представляющие клиентов банка: абстрактный класс Client, классы для физических лиц,
юридических лиц и индивидуальных предпринимателей.
У каждого клиента есть сумма денег на счету (число). Деньги можно положить на счёт, снять и вернуть остаток на счёте.
Каждый класс должен содержать метод, который выводит информацию в консоль о счёте: условие пополнения, условие снятия и баланс.
2. Реализуйте методы, при которых:
•	У физических лиц пополнение и снятие происходит без комиссии.
•	У юридических лиц — снятие с комиссией 1%.
•	У ИП — пополнение с комиссией 1%, если сумма меньше 1000 рублей.
И с комиссией 0,5%, если сумма больше либо равна 1000 рублей.

 */
public class Main {
    public static void main(String[] args) {
        NaturalPerson naturalPerson = new NaturalPerson(10000);
        LegalEntity legalEntity = new LegalEntity(10000);
        IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur(10000);

        naturalPerson.accountInformation();
        legalEntity.accountInformation();
        individualEntrepreneur.accountInformation();
        System.out.println("------------------------------------------------");
        naturalPerson.depositMoneyToBill(20000);
        legalEntity.depositMoneyToBill(100000);
        individualEntrepreneur.depositMoneyToBill(50000);

        naturalPerson.accountInformation();
        legalEntity.accountInformation();
        individualEntrepreneur.accountInformation();
        System.out.println("------------------------------------------------");
        naturalPerson.takeMoneyFromBill(10000);
        legalEntity.takeMoneyFromBill(10000);
        individualEntrepreneur.takeMoneyFromBill(10000);

        naturalPerson.accountInformation();
        legalEntity.accountInformation();
        individualEntrepreneur.accountInformation();
        System.out.println("------------------------------------------------");
        naturalPerson.takeMoneyFromBill(-10000);
    }
}
