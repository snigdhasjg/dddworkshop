package com.thoughtworks.ddd.domain;

import java.util.UUID;

public class Item {
    private Product product;
    private Integer quantity;

    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Item(Product product) {
        this(product, 1);
    }
}
