package dev.khusanjon.payme.repository;

import dev.khusanjon.payme.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "select * from customer c " +
            "join ordr o on c.id=o.cust_id  and " +
            "`date` between '2016/01/01' and '2016/12/31'",
    nativeQuery = true)
    List<Customer> findCustomersWithoutOrders();

}
