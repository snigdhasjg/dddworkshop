package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {
    private final Long id;
    private final List<Item> items;
    private final List<CartOperation> cartOperations;

    public Cart(Long id) {
        this.items = new ArrayList<>();
        this.cartOperations = new ArrayList<>();
        this.id = id;
    }

    public void removeItem(Item item) {
        items.remove(item);
        cartOperations.add(CartOperation.deleteOperation(item));
    }

    void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<CartOperation> getCartOperations() {
        return cartOperations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
