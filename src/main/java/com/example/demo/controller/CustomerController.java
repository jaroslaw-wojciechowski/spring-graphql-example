package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

  @Autowired
  private CustomerRepository repository;

  @QueryMapping
  public List<Customer> findCustomers() {
    return repository.findAll(Sort.by(Sort.Direction.ASC, "created"));
  }

  @QueryMapping
  public Optional<Customer> findCustomerById(@Argument String id) {
    return repository.findById(id);
  }

  @MutationMapping
  public Customer createCustomer(@Argument String firstName, @Argument String lastName,
      @Argument int age) {
    Customer customer = new Customer(firstName, lastName, age);
    repository.save(customer);

    return customer;
  }
}
