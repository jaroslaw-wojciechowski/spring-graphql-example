package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphMongoApplication implements CommandLineRunner {

  @Autowired
  private CustomerRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(GraphMongoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    repository.save(new Customer("Alice", "Smith", 32));
//    repository.save(new Customer("Bob", "Smith", 45));
//    repository.save(new Customer("Marek", "Kowalski", 41));
//    repository.save(new Customer("Ewa", "Balcerowicz", 28));

    for (Customer customer : repository.findAll()) {
      System.out.println(customer);
    }
  }
}
