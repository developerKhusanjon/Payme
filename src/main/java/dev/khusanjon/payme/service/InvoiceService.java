package dev.khusanjon.payme.service;

import dev.khusanjon.payme.domain.Invoice;
import dev.khusanjon.payme.holder.WrongInvoice;
import dev.khusanjon.payme.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getExpiredInvoices() {
        return invoiceRepository.findExpiredInvoices();
    }

    public List<WrongInvoice> getWrongDateInvoices() {
        return invoiceRepository.findAll().stream()
                .filter(invoice ->
                        invoice.getIssued().compareTo(invoice.getDue())<0)
                            .map(invoice -> new WrongInvoice(invoice.getId(),invoice.getIssued(),invoice.getOrder()!=null?invoice.getOrder().getId():null)).collect(Collectors.toList());
    }

    public Invoice saveInvoice(Invoice invoice){
        return invoiceRepository.save(invoice);
    }

    public Optional<Invoice> invoiceById(Integer id){
        return invoiceRepository.findById(id);
    }
}
