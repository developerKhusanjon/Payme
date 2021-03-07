package dev.khusanjon.payme.repository;

import dev.khusanjon.payme.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

    @Query(value = "select * from invoice i " +
            "where i.issued>i.due",
            nativeQuery = true)
    List<Invoice> findExpiredInvoices();

}
