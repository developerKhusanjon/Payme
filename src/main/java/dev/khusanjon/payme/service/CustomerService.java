package dev.khusanjon.payme.service;

import dev.khusanjon.payme.domain.Customer;
import dev.khusanjon.payme.domain.Order;
import dev.khusanjon.payme.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> customersWithoutOrders() throws ParseException {
        return customerRepository.findCustomersWithoutOrders();
    }

    public List<Map<String,?>> customerLastOrders(){
        return customerRepository.findAll().stream()
                .filter(customer -> !(customer.getOrders().isEmpty()))
                .map(customer -> Map.of("ID",customer.getId(),
                                        "name",customer.getName(),
                                        "last_order_date",customer.getOrders().stream()
                                                .map(Order::getDate).max(Date::compareTo)
                                                    .stream().findFirst())).collect(Collectors.toList());
    }

    public List<Map<?,?>> numberOfProductsInYear() throws ParseException {

        Date d1 = sdformat.parse("2016-01-01");
        Date d2 = sdformat.parse("2016-12-31");

        return customerRepository.findAll()
                .stream().filter(customer -> customer.getOrders().stream()
                        .anyMatch(order -> order.getDate().compareTo(d1)>0&&order.getDate().compareTo(d2)<0))
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .map(customerLongEntry -> Map.of(customerLongEntry.getKey().getCountry(),customerLongEntry.getValue()))
                .collect(Collectors.toList());
    }

    public Optional<Customer> customerById(Integer id){
        return customerRepository.findById(id);
    }
}
