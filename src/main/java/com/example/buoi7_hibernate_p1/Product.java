package com.example.buoi7_hibernate_p1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Column
    private String productName;

    @Column
    private BigDecimal price;

    @Column
    private Integer quantity;
}
