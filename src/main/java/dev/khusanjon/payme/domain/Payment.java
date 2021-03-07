package dev.khusanjon.payme.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "inv_id")
    private Invoice invoice;
    @Basic(optional = false)
    @Column(insertable = false, updatable = false,
            columnDefinition = "datetime default '2016/01/01'")
    @Temporal(TemporalType.TIMESTAMP)
    @NotBlank
    private Date time;
    @Column(length = 8, precision = 2)
    @NotBlank
    private Double amount;

    public Payment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice inv_id) {
        this.invoice = inv_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        return invoice != null ? invoice.equals(payment.invoice) : payment.invoice == null;
    }

    @Override
    public int hashCode() {
        return invoice != null ? invoice.hashCode() : 0;
    }
}
