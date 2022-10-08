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
@Table(name = "ORDER_LINES")
public class OrderLine {
    @Id
    @Column(name="ORDER_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JoinColumn(name="ORDER_ID", nullable = false, updatable = false)
    @ManyToOne
    private Order order;

    @OneToOne
    @JoinColumn(name="PRODUCT_ID", nullable = false, updatable = false)
    private Product product;

    @Column(name="QUANTITY")
    private int quantity;

}
