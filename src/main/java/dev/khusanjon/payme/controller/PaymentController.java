package dev.khusanjon.payme.controller;

import dev.khusanjon.payme.domain.Payment;
import dev.khusanjon.payme.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/overpaid_invoices")
    public List<Map<String,?>> getOverpaidInvoices(){
        return paymentService.overpaidInvoices();
    }

    @PostMapping("/payment")/***/
    public Map<String,?> makePayment(@RequestBody Map<String,Integer> inv_id){
        return paymentService.makePayment(inv_id);
    }

    @GetMapping("/payment/details")
    public Optional<Payment> getPaymentDetails(@RequestParam Integer p_id){
        return paymentService.paymentDetails(p_id);
    }
}
