package ru.zharinov.tasks.task_from_course01.lesson11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MyCRUD {

    public static final String TEXT = "Example:" + "\nshowProductsByPerson имя_покупателя - " +
            "посмотреть какие товары покупал клиент\nfindPersonsByProductTitle " +
            "название_товара - какие клиенты купили определенный товар\n" +
            "removePerson(removeProduct) имя_элемента - " +
            "предоставить возможность удалять из базы товары/покупателей,\n" +
            "addBuyer имя_покупателя - добавить покупателя\n" +
            "addProduct название товара цена - добавить продукт\n" +
            "buy имя_покупателя название_товара - организовать возможность “покупки товара”";

    private static SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Buyer.class)
            .addAnnotatedClass(Product.class)
            .addAnnotatedClass(Order.class)
            .buildSessionFactory();

    private static Session session;

    public void buy(String buyer, String product) {
        session = factory.getCurrentSession();
        session.beginTransaction();

        Buyer resultBuyer = (Buyer) session.createQuery("from Buyer b where b.name = :buyer")
                .setParameter("buyer", buyer).getSingleResult();
        Product resultProduct = (Product) session.createQuery("from Product p where p.title = :product")
                .setParameter("product", product).getSingleResult();
        Order.Id id = new Order.Id();
        id.setBuyerId(resultBuyer.getId());
        id.setProductId(resultProduct.getId());

        Order order = new Order();
        order.setId(id);
        order.setPrice(resultProduct.getCost());

        session.save(order);
        session.getTransaction().commit();
        System.out.println("Saved the order");
        System.out.println(TEXT);
    }

    public void showProductsByPerson(String buyer) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Buyer resultBuyer = (Buyer) session.createQuery("from Buyer p where p.name = :buyer")
                .setParameter("buyer", buyer).getSingleResult();
        List<Order> orders = resultBuyer.getProducts();
        System.out.println("Product: " + resultBuyer.getName() + orders);
        session.getTransaction().commit();
        System.out.println(TEXT);
    }

    public void findPersonsByProductTitle(String product) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Product resultProduct = (Product) session.createQuery("from Product p where p.title = :product")
                .setParameter("product", product).getSingleResult();
        List<Order> buyers = resultProduct.getBuyers();
        System.out.println("Product: " + resultProduct.getTitle() + buyers);
        session.getTransaction().commit();
        System.out.println(TEXT);
    }

    public void removeBuyer(String buyer) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Buyer resultBuyer = (Buyer) session.createQuery("from Buyer p where p.name = :buyer")
                .setParameter("buyer", buyer).getSingleResult();
        session.remove(resultBuyer);
        session.getTransaction().commit();
        System.out.println("Remove the buyer");
        System.out.println(TEXT);
    }

    public void removeProduct(String product) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Product resultProduct = (Product) session.createQuery("from Product p where p.title = :product")
                .setParameter("product", product).getSingleResult();
        session.remove(resultProduct);
        session.getTransaction().commit();
        System.out.println("Remove the product");
        System.out.println(TEXT);
    }

    public void addBuyer(String buyer) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Buyer newBuyer = new Buyer();
        newBuyer.setName(buyer);
        session.save(newBuyer);
        session.getTransaction().commit();
        System.out.println("Add the product");
        System.out.println(TEXT);
    }

    public void addProduct(String product, String cost) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Product newProduct = new Product();
        newProduct.setTitle(product);
        newProduct.setCost(Integer.parseInt(cost));
        session.save(newProduct);
        session.getTransaction().commit();
        System.out.println("Add the product");
        System.out.println(TEXT);
    }
}
