package dev.khusanjon.payme.service;

import dev.khusanjon.payme.repository.DetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Service
public class DetailService {
    private final DetailRepository detailRepository;

    public DetailService(DetailRepository detailRepository) {
        this.detailRepository = detailRepository;
    }

    public List<Map<String,?>> highDemandProducts(){
        return detailRepository.findAll().stream()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(detailLongEntry -> detailLongEntry.getValue()>10)
                .map(detailLongEntry -> Map.of("Product_code",detailLongEntry.getKey().getProduct()!=null?detailLongEntry.getKey().getProduct().getProduct_code():"null",
                                                "Total_order_number",detailLongEntry.getValue()))
                .collect(Collectors.toList());
    }

    public List<Map<String,?>> bulkProducts(){
        return detailRepository.findAll().stream()
                .filter(detail -> detail.getQuantity()>=8)
                .map(detail -> Map.of("Product_code",detail.getProduct()!=null?detail.getProduct().getProduct_code():"null",
                                        "Product_price",detail.getProduct()!=null?detail.getProduct().getPrice():"null"))
                .collect(Collectors.toList());
    }
}
