package dev.khusanjon.payme.domain;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(max = 14)
    private String name;
    @NotBlank
    @Size(max = 3)
    private String country;
    @Lob
    private String address;
    @Size(max = 50)
    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

    public Customer() {
    }

    public Customer(@NotBlank @Size(max = 14) String name, @NotBlank @Size(max = 3) String country, String address, @Size(max = 50) String phone) {
        this.name = name;
        this.country = country;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> oders) {
        this.orders = oders;
    }

   /* Differentiate customers by their countries
       equalsAndHashCodes are implementing with
       country field of customer entity
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return country != null ? country.equals(customer.country) : customer.country == null;
    }

    @Override
    public int hashCode() {
        return country != null ? country.hashCode() : 0;
    }
}
