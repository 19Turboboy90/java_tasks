package ru.zharinov.tasks.task_from_course.lesson11;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyers", schema = "lesson11")
@NoArgsConstructor
@Setter
@Getter
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "buyer")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Order> products;

    @Override
    public String toString() {
        return "buyer='{'" + name + "'}'";
    }
}
