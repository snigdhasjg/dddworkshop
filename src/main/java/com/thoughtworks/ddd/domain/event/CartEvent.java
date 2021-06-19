package com.thoughtworks.ddd.domain.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class CartEvent {
    private final OperationType operationType;

    enum OperationType {
        DELETE_ITEM,
        CHECKOUT
    }
}

