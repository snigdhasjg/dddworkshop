//package com.thoughtworks.ddd.domain;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CartTest {
//
//    @Test
//    void shouldAddAnIPadProToACart() {
//        Cart cart = new Cart(1L);
//        Product iPadPro = new Product("IPad pro");
//        Item item = new Item(iPadPro);
//        cart.addItem(item);
//        assertTrue(cart.getItems().contains(item));
//    }
//
//    @Test
//    void shouldAddHeroInkPenToACart() {
//        Cart cart = new Cart(2L);
//        Product heroInkPen = new Product("Hero ink Pen");
//        Item item = new Item(heroInkPen);
//        cart.addItem(item);
//        assertTrue(cart.getItems().contains(item));
//    }
//
//    @Test
//    void shouldAddTwoCricketBatToACart() {
//        Cart cart = new Cart(3L);
//        Product gmCricketBat = new Product("GM Cricket bat");
//        Item item = new Item(gmCricketBat, 2);
//        cart.addItem(item);
//        assertTrue(cart.getItems().contains(item));
//    }
//
//    @Test
//    void shouldRemoveAItemFromTheCart() {
//        Cart cart = new Cart(4L);
//        Product gmCricketBat = new Product("GM Cricket bat");
//        Item gmCricketBatItem = new Item(gmCricketBat, 2);
//        Product iPadPro = new Product("IPad pro");
//        Item iPadProItem = new Item(iPadPro);
//        cart.addItem(iPadProItem);
//        cart.addItem(gmCricketBatItem);
//
//        cart.removeItem(iPadProItem);
//
//        assertFalse(cart.getItems().contains(iPadProItem));
//
//        assertTrue(cart.getItems().contains(gmCricketBatItem));
//    }
//
//}