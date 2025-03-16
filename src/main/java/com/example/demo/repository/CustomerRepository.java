package com.example.demo.repository;

import com.example.demo.model.Customer;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

  public Customer findByFirstName(String firstName);

  public List<Customer> findByLastName(String lastName);

}

