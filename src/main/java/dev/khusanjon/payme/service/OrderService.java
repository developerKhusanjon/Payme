package dev.khusanjon.payme.service;
import dev.khusanjon.payme.domain.Detail;
import dev.khusanjon.payme.domain.Invoice;
import dev.khusanjon.payme.domain.Order;
import dev.khusanjon.payme.holder.SpecialOrder;
import dev.khusanjon.payme.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private InvoiceService invoiceService;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> ordersWithoutDetail() throws ParseException {

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse("2016-09-06");

        return orderRepository.findAll().stream()
                    .filter(order ->
                            (order.getDetails().isEmpty())&&(order.getDate().compareTo(d1)<0)).collect(Collectors.toList());
    }

    public List<Map<String,?>> ordersWithoutInvoices(){
        return orderRepository.findAll().stream()
                .filter(order -> order.getInvoice()==null&&!order.getDetails().isEmpty())
                .map(order -> Map.of("ID",order.getId(),"Date",order.getDate(),
                        "Total_price",order.getDetails().stream().map(detail -> detail.getQuantity()*detail.getProduct().getPrice()).mapToDouble(Double::doubleValue).sum()))
                .collect(Collectors.toList());
    }

    public Map<String,?> makeOrder(SpecialOrder order){
        Order order1 = new Order();
        String status_string;
        Integer invoice_number = -1;

        if (customerService.customerById(order.getCustomer_id()).isPresent()&&productService.productById(order.getProduct_id()).isPresent()){
            status_string = "SUCCESS";
            order1.setCustomer(customerService.customerById(order.getCustomer_id()));
            order1.setDate(new Date());
            Invoice invoice = new Invoice();
            invoice.setOrder(orderRepository.save(order1));
            invoice_number = invoiceService.saveInvoice(invoice).getId();
        }else {
            status_string = "FAILED";
        }

        return Map.of("status",status_string,"invoice_number",invoice_number);
    }

    public List<Detail> orderDetails(Integer order_id){
       return orderRepository.findById(order_id).get().getDetails();
    }
}
