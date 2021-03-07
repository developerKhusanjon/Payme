package dev.khusanjon.payme.repository;

import dev.khusanjon.payme.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DetailRepository extends JpaRepository<Detail,Integer> {

//
//    @Query(value = "select `country` from customer c " +
//            "where i.issued>i.due",
//            nativeQuery = true)
//    List<Map<?,?>> findNumberOfProductsInYear();

}
