package dev.khusanjon.payme.controller;

import dev.khusanjon.payme.domain.Customer;
import dev.khusanjon.payme.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers_without_orders")
    public List<Customer> getCustomersWithoutOrders() throws ParseException {
        return customerService.customersWithoutOrders();
    }

    @GetMapping("/customers_last_orders")
    public List<Map<String,?>> getCustomersLastOrders(){
        return customerService.customerLastOrders();
    }

    @GetMapping("/number_of_products_in_year")
    public List<Map<?,?>> getNumberOfProductsInYear() throws ParseException {
        return customerService.numberOfProductsInYear();
    }
}
