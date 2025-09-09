package com.example.accounts.repository;

import com.example.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Method to find a customer by their mobile number
    Optional<Customer> findByMobileNumber(String mobileNumber);

    // Method to delete a customer by their mobile number
    void deleteByMobileNumber(String mobileNumber);
}
