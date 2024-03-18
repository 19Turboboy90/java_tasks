package ru.zharinov.tasks.task_from_course.lesson11;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products", schema = "lesson11")
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private int cost;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Order> buyers;

    @Override
    public String toString() {
        return "Product{" + "title='" + title + '\'' + ", cost=" + cost + '}';
    }
}
