package com.example.experiment4;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
/*
CustomerRepository extends the CrudRepository interface. The type of entity and ID that it works with, Customer and Long,
are specified in the generic parameters on CrudRepository. By extending CrudRepository,
CustomerRepository inherits several methods for working with Customer persistence,
including methods for saving, deleting, and finding Customer entities.
Spring Data JPA also lets you define other query methods by declaring their method signature.
For example, CustomerRepository includes the findByLastName() method.

In a typical Java application, you might expect to write a class that implements CustomerRepository.
However, that is what makes Spring Data JPA so powerful: You need not write an implementation of the repository interface.
Spring Data JPA creates an implementation when you run the application.

 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
