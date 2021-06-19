package com.thoughtworks.ddd.domain;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {
    private final List<Item> items;
}
