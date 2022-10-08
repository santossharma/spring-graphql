package com.linkedin.learning.hplus.controller;

import com.linkedin.learning.hplus.data.SalesPerson;
import com.linkedin.learning.hplus.data.SalespersonRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by santoshsharma on 08 Oct, 2022
 */


@RestController
public class SalespersonController {

    private final SalespersonRepository salespersonRepository;

    public SalespersonController(SalespersonRepository salespersonRepository) {
        this.salespersonRepository = salespersonRepository;
    }

    @QueryMapping
    public Iterable<SalesPerson> salespeople(){
        return this.salespersonRepository.findAll();
    }

    @QueryMapping
    public SalesPerson salespersonById(@Argument Long id){
        return this.salespersonRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public SalesPerson salespersonByEmail(@Argument String email){
        return this.salespersonRepository.findSalesPersonByEmail(email);
    }
}
