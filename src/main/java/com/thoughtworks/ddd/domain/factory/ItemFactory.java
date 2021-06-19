package com.thoughtworks.ddd.domain.factory;

import com.thoughtworks.ddd.domain.Item;
import com.thoughtworks.ddd.domain.Product;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

@AllArgsConstructor
@NoArgsConstructor
public class ItemFactory {
    public static final double DISCOUNT_FACTOR = 0.9;
    private Map<String, Product.Price> competitorPrices = new HashMap<>();

    public Item createItem(Product product, Integer quantity) {
        Product.Price competitorPrice = competitorPrices.get(product.getName());
        Item.Price itemPrice;
        if (nonNull(competitorPrice)) {
            itemPrice = new Item.Price(competitorPrice.getValue() * DISCOUNT_FACTOR, competitorPrice.getCurrency());
        } else {
            Product.Price productPrice = product.getPrice();
            itemPrice = new Item.Price(productPrice.getValue(), productPrice.getCurrency());
        }
        return new Item(product, itemPrice, quantity);
    }

    public Item createItem(Product product) {
        return createItem(product, 1);
    }
}
