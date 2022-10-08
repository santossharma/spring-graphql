package com.linkedin.learning.hplus.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by santoshsharma on 08 Oct, 2022
 */

@Getter
@Setter
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SIZE")
    private int size;

    @Column(name = "VARIETY")
    private String variety;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "STATUS")
    private String status;

}
