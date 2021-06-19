package com.thoughtworks.misc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customer {
    private final List<Account> accounts;
    private Address address;

    public void updateAddress(Address address) {
        this.address = address;
        accounts.forEach(e -> e.setAddress(address));
    }
}
