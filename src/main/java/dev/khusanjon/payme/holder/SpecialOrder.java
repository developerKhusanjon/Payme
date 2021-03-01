package dev.khusanjon.payme.holder;

public class SpecialOrder {
    private Integer customer_id;
    private Integer product_id;
    private Short quantity;

    public SpecialOrder(Integer customer_id, Integer product_id, Short quantity) {
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }
}
