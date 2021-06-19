package com.thoughtworks.ddd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Currency;

@AllArgsConstructor
@Data
public class Item {
    private final Product product;
    private Price perUnitPrice;
    private Integer quantity;

    @Data
    public static class Price {
        private final Double value;
        private final Currency currency;
    }


}
