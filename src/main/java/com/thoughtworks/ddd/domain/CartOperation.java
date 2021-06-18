package com.thoughtworks.ddd.domain;

public class CartOperation {
    private OperationType operationType;
    private Item item;

    private CartOperation(OperationType operationType, Item item) {
        this.operationType = operationType;
        this.item = item;
    }

    public static CartOperation deleteOperation(Item item) {
        return new CartOperation(OperationType.DELETE, item);
    }

    enum OperationType {
        DELETE
    }
}

