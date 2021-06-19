package com.thoughtworks.ddd.domain;

import lombok.Data;

import java.util.Currency;

@Data
public class Product {

    private final String name;
    private final Price price;

    @Data
    public static class Price {
        private final Double value;
        private final Currency currency;
    }
}
