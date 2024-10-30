package com.example.demo;

import com.example.demo.Dao.repository.CustomerRepository;
import com.example.demo.Dao.entities.Customer;  // Import Customer entity
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.demo.Dao.repository")
@EntityScan(basePackages = "com.example.demo.Dao.entities")
@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder().name("X").email("X@gmail.com").build());
			customerRepository.save(Customer.builder().name("Y").email("Y@gmail.com").build());
		};
	}
}
