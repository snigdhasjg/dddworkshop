package com.thoughtworks.ddd.domain.event;

public class CartCheckoutEvent extends CartEvent {
    public CartCheckoutEvent() {
        super(OperationType.CHECKOUT);
    }
}
