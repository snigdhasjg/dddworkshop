package com.thoughtworks.ddd.domain.event;

import com.thoughtworks.ddd.domain.Item;

public class CartDeleteItemEvent extends CartEvent {
    private final String itemDetails;

    public CartDeleteItemEvent(Item item) {
        super(OperationType.DELETE_ITEM);
        this.itemDetails = item.toString();
    }
}
