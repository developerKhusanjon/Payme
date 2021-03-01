package dev.khusanjon.payme.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ord_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "pr_id")
    private Product product;
    @NotBlank
    private Short quantity;

    public Detail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order ord_id) {
        this.order = ord_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product pr_id) {
        this.product = pr_id;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Detail detail = (Detail) o;

        return product != null ? product.equals(detail.product) : detail.product == null;
    }

    @Override
    public int hashCode() {
        return product != null ? product.hashCode() : 0;
    }
}
