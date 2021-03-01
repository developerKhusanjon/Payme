package dev.khusanjon.payme.holder;

import java.util.Date;

public class WrongInvoice {
    private Integer invoice_id;
    private Date issued_date;
    private Integer order_id;

    public WrongInvoice(Integer invoice_id, Date issued_date, Integer order_id) {
        this.invoice_id = invoice_id;
        this.issued_date = issued_date;
        this.order_id = order_id;
    }

    public Integer getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Date getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(Date issued_date) {
        this.issued_date = issued_date;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }
}
