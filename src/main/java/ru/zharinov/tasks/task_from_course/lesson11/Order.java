package ru.zharinov.tasks.task_from_course.lesson11;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "buyers_products", schema = "lesson11")
@NoArgsConstructor
@Setter
@Getter
public class Order {
    @Embeddable
    @Data
    public static class Id implements Serializable {
        @Column(name = "buyer_id")
        int buyerId;

        @Column(name = "product_id")
        int productId;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Id id = (Id) o;
            return buyerId == id.buyerId && productId == id.productId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(buyerId, productId);
        }
    }

    @EmbeddedId
    Id id;

    @ManyToOne
    @JoinColumn(name = "buyer_id", insertable = false, updatable = false)
    Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    Product product;

    @Column(name = "price")
    int price;

    @Override
    public String toString() {
        return "'{'" + buyer + product + '}';
    }
}

