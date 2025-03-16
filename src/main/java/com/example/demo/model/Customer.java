package com.example.demo.model;

import java.time.Instant;
import java.util.Date;
import org.springframework.data.annotation.Id;

public class Customer {
  @Id
  public String id;

  public String firstName;
  public String lastName;
  public int age;
  public Instant created;

  public Customer() {
  }

  public Customer(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.created = new Date().toInstant();
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firstName='%s', lastName='%s', age=%s, created=%s]",
        id, firstName, lastName, age, created);
  }

}

