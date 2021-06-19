package com.thoughtworks.ddd.domain;

import com.thoughtworks.ddd.domain.event.CartEvent;
import com.thoughtworks.ddd.domain.event.CartCheckoutEvent;
import com.thoughtworks.ddd.domain.event.CartDeleteItemEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cart {
    @EqualsAndHashCode.Include
    private final Long id;
    private State state;
    @Getter
    private final List<Item> items;
    @Getter
    private final List<CartEvent> cartEvents;

    public Cart(Long id) {
        this.items = new ArrayList<>();
        this.cartEvents = new ArrayList<>();
        this.id = id;
        this.state = State.UNCHECKED;
    }

    public void removeItem(Item item) {
        CartEvent cartEvent = new CartDeleteItemEvent(item);
        cartEvents.add(cartEvent);
        items.remove(item);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Order checkOut() {
        CartEvent cartEvent = new CartCheckoutEvent();
        cartEvents.add(cartEvent);
        this.state = State.CHECKED;
        return new Order(items);
    }

    enum State {
        UNCHECKED,
        CHECKED,
    }

}
