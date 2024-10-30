package com.example.demo.web;

import com.example.demo.Dao.entities.Customer;
import com.example.demo.Dao.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

    private final CustomerRepository customerRepository;

    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> customerList() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer customerById(@PathVariable Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}
