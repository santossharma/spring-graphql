package com.linkedin.learning.hplus.service;

import com.linkedin.learning.hplus.data.Customer;
import com.linkedin.learning.hplus.data.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by santoshsharma on 07 Oct, 2022
 */

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    public Customer findCustomerByEmailId(String email) {
        return customerRepository.findCustomerByEmail(email);
    }

    public Customer saveCustomer(Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }


}
