package com.linkedin.learning.hplus.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by santoshsharma on 08 Oct, 2022
 */

public interface SalespersonRepository extends JpaRepository<SalesPerson, Long> {

    SalesPerson findSalesPersonByEmail(String email);
}
