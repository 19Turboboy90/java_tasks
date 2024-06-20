package ru.zharinov.tasks.task_from_course01.lesson11;

import java.util.Scanner;

/*
1. В базе данных необходимо иметь возможность хранить информацию о покупателях (id, имя)
и товарах (id, название, стоимость);
2. У каждого покупателя свой набор купленных товаров, одна покупка одного товара это
отдельная запись в таблице (группировать не надо);
3. Написать тестовое консольное приложение (просто Scanner и System.out.println()), которое
позволит выполнять команды:
/showProductsByPerson имя_покупателя - посмотреть какие товары покупал клиент;
/findPersonsByProductTitle название_товара - какие клиенты купили определенный товар;
/removePerson(removeProduct) имя_элемента - предоставить возможность удалять из базы
товары/покупателей,
/buy имя_покупателя название_товара - организовать возможность “покупки товара”.
4. * Добавить детализацию по паре покупатель-товар: сколько стоил товар, в момент покупки
клиентом;
 */
public class Main {
    public static void main(String[] args) {
        MyCRUD myCRUD = new MyCRUD();
        Scanner scanner = new Scanner(System.in);
        System.out.println(MyCRUD.TEXT);
        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }
            String[] words = command.split(" ");
            switch (words[0]) {
                case "buy":
                    myCRUD.buy(words[1], words[2]);
                    break;
                case "showProductsByPerson":
                    myCRUD.showProductsByPerson(words[1]);
                    break;
                case "findPersonsByProductTitle":
                    myCRUD.findPersonsByProductTitle(words[1]);
                    break;
                case "removeBuyer":
                    myCRUD.removeBuyer(words[1]);
                    break;
                case "removeProduct":
                    myCRUD.removeProduct(words[1]);
                    break;
                case "addBuyer":
                    myCRUD.addBuyer(words[1]);
                    break;
                case "addProduct":
                    myCRUD.addProduct(words[1], words[2]);
                    break;
            }
        }
    }
}
