package com.linkedin.learning.hplus.controller;

import com.linkedin.learning.hplus.data.Customer;
import com.linkedin.learning.hplus.model.CustomerInput;
import com.linkedin.learning.hplus.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by santoshsharma on 07 Oct, 2022
 */

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @QueryMapping
    public Iterable<Customer> customers() {
        log.info("Loading customers..");
        return customerService.findAllCustomers();
    }

    @QueryMapping
    public Customer customerById(@Argument Long id) {
        log.info("Loading customers by id..{}",id);
        return customerService.findCustomerById(id).orElseThrow();
    }

    @QueryMapping
    public Customer customerByEmail(@Argument String email) {
        log.info("Loading customer by email..{}",email);
        return customerService.findCustomerByEmailId(email);
    }

    @MutationMapping
    public Customer addCustomer(@Argument (name = "input") CustomerInput customerInput) {
        return customerService.saveCustomer(customerInput.getCustomerEntity());
    }
}
