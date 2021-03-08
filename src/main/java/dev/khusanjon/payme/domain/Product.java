package dev.khusanjon.payme.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(max = 10)
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @Size(max = 20)
    private String description;
    @Column(length = 6, precision = 2)
    private Double price;
    @Size(max = 1024)
    private String photo;

    private Integer product_code;

    public Product() {
    }

    public Product(@Size(max = 10) String name, @Size(max = 20) String description, @Size(max = 1024) String photo, Double price,  Category category, Integer product_code) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.photo = photo;
        this.product_code = product_code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_code() {
        return product_code;
    }

    public void setProduct_code(Integer product_code) {
        this.product_code = product_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category_id) {
        this.category = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id != null ? id.equals(product.id) : product.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
