package dev.khusanjon.payme.controller;

import dev.khusanjon.payme.domain.Order;
import dev.khusanjon.payme.holder.SpecialOrder;
import dev.khusanjon.payme.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders_without_details")
    public List<Order> getOrdersWithoutDetails() throws ParseException {
        return orderService.ordersWithoutDetail();
    }

    @GetMapping("/orders_without_invoices")
    public List<Map<String,?>> getOrdersWithoutInvoices(){
        return orderService.ordersWithoutInvoices();
    }

    @PostMapping("/order")
    public Map<String,?> makeOrder(@RequestBody SpecialOrder specialOrder){
        return orderService.makeOrder(specialOrder);
    }

    @GetMapping("order/details")
    public Map<String,?>  getOrderDetails(@RequestParam Integer order_id){
        return orderService.orderDetails(order_id);
    }
}
