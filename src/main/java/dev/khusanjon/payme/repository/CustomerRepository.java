package dev.khusanjon.payme.repository;

import dev.khusanjon.payme.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

//    @Query(value = "SELECT * FROM customer s " +
//            "WHERE s.created_at >= '2016-01-01 00:00:00' " +
//            "AND s.created_at <= '2016-12-31 23:59:59'",
//    nativeQuery = true)
//    List<Customer> findCustomersWithoutOrders();
}
