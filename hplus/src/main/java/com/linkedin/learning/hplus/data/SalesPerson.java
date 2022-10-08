package com.linkedin.learning.hplus.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by santoshsharma on 08 Oct, 2022
 */

@Getter
@Setter
@Entity
@Table(name = "SALESPEOPLE")
public class SalesPerson {
    @Id
    @Column(name="SALESPERSON_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL")
    private String email;
    @Column(name="PHONE")
    private String phoneNumber;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="CITY")
    private String city;
    @Column(name="STATE")
    private String state;
    @Column(name="ZIPCODE")
    private String zipCode;
}
