package dev.khusanjon.payme.repository;

import dev.khusanjon.payme.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByInvoice_Id(Integer id);
}
