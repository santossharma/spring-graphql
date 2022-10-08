package com.linkedin.learning.hplus.model;

import com.linkedin.learning.hplus.data.Customer;
import lombok.Data;

/**
 * Created by santoshsharma on 07 Oct, 2022
 */

@Data
public class CustomerInput {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public Customer getCustomerEntity() {
        return Customer.builder()
            .firstName(this.firstName)
            .lastName(this.lastName)
            .email(this.email)
            .phone(this.phoneNumber)
            .address(this.address)
            .city(this.city)
            .state(this.state)
            .city(this.city)
            .zip(this.zipCode)
            .build();
    }
    
}
