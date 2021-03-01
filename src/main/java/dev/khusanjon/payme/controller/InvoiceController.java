package dev.khusanjon.payme.controller;

import dev.khusanjon.payme.domain.Invoice;
import dev.khusanjon.payme.holder.WrongInvoice;
import dev.khusanjon.payme.service.InvoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/expired_invoices")
    public List<Invoice> getExpiredInvoices(){
        return invoiceService.getExpiredInvoices();
    }

    @GetMapping("/wrong_date_invoices")
    public List<WrongInvoice> getWrongInvoices(){
        return invoiceService.getWrongDateInvoices();
    }

}
