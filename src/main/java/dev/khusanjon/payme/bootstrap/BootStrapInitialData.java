package dev.khusanjon.payme.bootstrap;

import dev.khusanjon.payme.domain.*;
import dev.khusanjon.payme.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@Component
public class BootStrapInitialData implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;
    private final InvoiceRepository invoiceRepository;
    private final OrderRepository orderRepository;
    private final DetailRepository detailRepository;
    private final PaymentRepository paymentRepository;

    public BootStrapInitialData(CategoryRepository categoryRepository, CustomerRepository customerRepository, ProductRepository productRepository, InvoiceRepository invoiceRepository, OrderRepository orderRepository, DetailRepository detailRepository, PaymentRepository paymentRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
        this.invoiceRepository = invoiceRepository;
        this.orderRepository = orderRepository;
        this.detailRepository = detailRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

        List<Category> categories = Arrays.asList(
                new Category("clothe"),
                new Category( "food"),
                new Category( "book"),
                new Category( "item"),
                new Category( "course")
        );

        List<Customer> customers = Arrays.asList(
                new Customer("Husanjon Tuychiboev", "UZB", "7599 Amir Temur Ave", "(693) 575-8084"),
                new Customer( "Alimov Aziz", "UZB", "7570 Wolfgen Ave", "(693) 575-8084"),
                new Customer( "Shokirov Holmat", "UZB", "79 Humo Street", "(693) 575-8084"),
                new Customer( "Zoe Smith", "UK", "7599 Lectus Ave", "(693) 575-8084"),
                new Customer( "Alex Bass", "USA", "7 Thomson street", "(693) 575-8084"),
                new Customer( "Ahmadjon Tuychiboev", "UZB", "75 Amir Temur Ave", "(693) 505-8080"),
                new Customer( "Alimov Eldor", "RUS", "770 Wolfgen Ave", "(63) 575-7100"),
                new Customer( "Holdorov Holmat", "UZB", "79 Humo Street", "(693) 575-1211"),
                new Customer( "Jhon Smith", "UK", "199 Lectus Ave", "(3) 115-8055"),
                new Customer( "Alex Fury", "USA", "71 Thomson street", "(1) 555-1090"),
                new Customer( "Dilmrod Ochilov", "UZB", "9 Amir Temur Ave", "(998) 575-1014"),
                new Customer( "Soliyev Ali", "KG", "750 Wolfgen Ave", "(193) 575-8199"),
                new Customer( "Jim Kerry", "AUS", "79 Sydney Street", "(693) 575-8444"),
                new Customer( "Zoe Watson", "UK", "7599 Lectus Ave", "(693) 412-1066"),
                new Customer( "Max Bass", "USA", "27 Thomson street", "(693) 575-8004")
        );

        List<Product> products = Arrays.asList(
                new Product( "Spring in Action", "Bestseller book", "1234567", 40.99, categories.get(0), 3),
                new Product( "High Demand Course", "Spring Boot AmigosCode", "1234568", 50.00, categories.get(1), 5),
                new Product( "Good item in Big Sale", "Adidas Running Shoes", "1234569", 35.55, categories.get(2), 1),
                new Product("Best budget phone in 2020", "Samsung A51", "1234560", 270.99, categories.get(3), 4),
                new Product( "It will be best food You ate ever", "Andijoncha osh", "1234567", 1.99, categories.get(4), 2));

        List<Order> orders = Arrays.asList(
                new Order( customers.get(0), sdformat.parse("2016-01-01")),
                new Order( customers.get(1), sdformat.parse("2015-01-01")),
                new Order( customers.get(2), sdformat.parse("2015-04-11")),
                new Order( customers.get(1), sdformat.parse("2016-01-23")),
                new Order( customers.get(4), sdformat.parse("2017-01-12")),
                new Order( customers.get(5), sdformat.parse("2016-11-01")),
                new Order( customers.get(1), sdformat.parse("2017-06-11")),
                new Order( customers.get(7), sdformat.parse("2016-07-07")),
                new Order( customers.get(8), sdformat.parse("2015-01-08")),
                new Order( customers.get(1), sdformat.parse("2015-01-28")),
                new Order( customers.get(10), sdformat.parse("2016-01-18")),
                new Order( customers.get(11), sdformat.parse("2016-01-19")),
                new Order( customers.get(1), sdformat.parse("2015-09-01")),
                new Order( customers.get(13), sdformat.parse("2015-01-09")),
                new Order( customers.get(14), sdformat.parse("2016-05-15"))
        );

        List<Invoice> invoices = Arrays.asList(
                new Invoice( 40.5, sdformat.parse("2017-02-01"), sdformat.parse("2016-01-01"), orders.get(0)),
                new Invoice( 20.5, sdformat.parse("2016-01-22"), sdformat.parse("2016-05-24"), orders.get(1)),
                new Invoice( 44.5, sdformat.parse("2015-11-01"), sdformat.parse("2016-04-17"), orders.get(2)),
                new Invoice( 14.54, sdformat.parse("2016-10-11"), sdformat.parse("2016-01-11"), null),
                new Invoice( 41.45, sdformat.parse("2015-01-01"), sdformat.parse("2016-08-16"), orders.get(4)),
                new Invoice( 4.54, sdformat.parse("2015-07-15"), sdformat.parse("2016-02-12"), orders.get(5)),
                new Invoice( 45.9, sdformat.parse("2015-11-01"), sdformat.parse("2016-09-19"), null),
                new Invoice( 2.5, sdformat.parse("2015-04-11"), sdformat.parse("2015-03-13"), orders.get(7)),
                new Invoice( 5.5, sdformat.parse("2017-02-22"), sdformat.parse("2017-10-10"), orders.get(8)),
                new Invoice( 32.5, sdformat.parse("2016-07-07"), sdformat.parse("2016-11-13"), null),
                new Invoice( 3.5, sdformat.parse("2015-08-18"), sdformat.parse("2016-02-28"), orders.get(10)),
                new Invoice( 6.5, sdformat.parse("2016-01-01"), sdformat.parse("2015-04-14"), orders.get(11)),
                new Invoice( 13.5, sdformat.parse("2016-05-15"), sdformat.parse("2016-06-16"), null),
                new Invoice( 9.5, sdformat.parse("2016-05-05"), sdformat.parse("2016-05-19"), orders.get(13)),
                new Invoice( 2.5, sdformat.parse("2016-04-14"), sdformat.parse("2016-05-05"), orders.get(14))
        );


        List<Detail> details = Arrays.asList(
                new Detail(orders.get(0), products.get(0), (short) 32),
                new Detail( orders.get(1), products.get(1), (short) 2),
                new Detail( orders.get(2), products.get(1), (short) 3),
                new Detail( null, products.get(3), (short) 7),
                new Detail( orders.get(4), products.get(1), (short) 8),
                new Detail( orders.get(5), products.get(1), (short) 9),
                new Detail( null, products.get(1), (short) 12),
                new Detail( orders.get(7), products.get(0), (short) 92),
                new Detail( orders.get(8), products.get(1), (short) 29),
                new Detail( null, products.get(1), (short) 21),
                new Detail( orders.get(10), products.get(1), (short) 312),
                new Detail(orders.get(11), products.get(1), (short) 6),
                new Detail( null, products.get(1), (short) 4),
                new Detail( orders.get(13), products.get(1), (short) 5),
                new Detail( orders.get(14), products.get(1), (short) 3)
        );

        List<Payment> payments = Arrays.asList(
                new Payment( invoices.get(0), sdformat.parse("2015-11-01"), 15.70),
                new Payment( invoices.get(1), sdformat.parse("2015-11-01"), 5.70),
                new Payment( invoices.get(1), sdformat.parse("2015-11-01"), 55.70),
                new Payment( invoices.get(3), sdformat.parse("2015-11-01"), 1.70),
                new Payment( invoices.get(4), sdformat.parse("2015-11-01"), 13.03),
                new Payment( invoices.get(1), sdformat.parse("2015-11-01"), 15.72),
                new Payment( invoices.get(6), sdformat.parse("2015-11-01"), 15.31),
                new Payment( invoices.get(7), sdformat.parse("2015-11-01"), 23.90),
                new Payment( invoices.get(2), sdformat.parse("2015-11-01"), 15.00),
                new Payment( invoices.get(3), sdformat.parse("2015-11-01"), 6.00),
                new Payment( invoices.get(10), sdformat.parse("2015-11-01"), 8.00),
                new Payment( invoices.get(1), sdformat.parse("2015-11-01"), 7.40),
                new Payment( invoices.get(2), sdformat.parse("2015-11-01"), 4.50),
                new Payment( invoices.get(3), sdformat.parse("2015-11-01"), 5.50),
                new Payment( invoices.get(14), sdformat.parse("2015-11-01"), 1.50)
        );

        categoryRepository.saveAll(categories);
//        customerRepository.flush();
        customerRepository.saveAll(customers);
//        productRepository.flush();
        productRepository.saveAll(products);
//        invoiceRepository.flush();
        orderRepository.saveAll(orders);
//        orderRepository.flush();
        invoiceRepository.saveAll(invoices);
//        detailRepository.flush();
        detailRepository.saveAll(details);
//        paymentRepository.flush();
        paymentRepository.saveAll(payments);

    }
}
