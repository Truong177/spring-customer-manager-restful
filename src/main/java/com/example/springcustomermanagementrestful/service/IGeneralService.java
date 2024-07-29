package com.example.springcustomermanagementrestful.service;

import com.example.springcustomermanagementrestful.model.Customer;

import java.util.Optional;

public interface IGeneralService <E>{
    Iterable<E> findAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);

    void remove(Long id);
}
