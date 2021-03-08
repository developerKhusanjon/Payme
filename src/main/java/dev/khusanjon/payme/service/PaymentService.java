package dev.khusanjon.payme.service;

import dev.khusanjon.payme.domain.Payment;
import dev.khusanjon.payme.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    @Autowired
    private InvoiceService invoiceService;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Map<String,?>> overpaidInvoices(){
        return paymentRepository.findAll().stream().collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(invoiceLongEntry -> invoiceLongEntry.getValue()>1)
                .map(invoiceLongEntry -> Map.of("Invoice_Number",invoiceLongEntry.getValue(),
                        "reimburse",invoiceLongEntry.getKey().getAmount()*invoiceLongEntry.getValue()))
                .collect(Collectors.toList());
    }

    public Map<String,?> makePayment(Map<String,Integer> payload){
        String status="FAILED";
        Payment payment = new Payment();
        Integer inv_id = payload.get("Invoice_id");

        if (invoiceService.invoiceById(inv_id).isPresent()){
            status="SUCCESS";
            payment.setInvoice(invoiceService.invoiceById(inv_id).get());
            payment.setAmount(invoiceService.invoiceById(inv_id).get().getAmount());
            payment.setTime(new Date());
            payment = paymentRepository.save(payment);
        }

        return Map.of("status",status,"payment_details",payment);
    }

    public Optional<Payment> paymentDetails(Integer p_id){
        return paymentRepository.findById(p_id);
    }

}
