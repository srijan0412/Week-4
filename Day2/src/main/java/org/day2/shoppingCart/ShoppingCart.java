package org.day2.shoppingCart;

import java.util.*;

class ShoppingCart {
    private final HashMap<String, Double> productPrices;
    private final LinkedHashMap<String, Integer> cart;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not available.");
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue() + " - Price: " + productPrices.get(entry.getKey()));
        }
    }

    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedProducts = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sortedProducts.put(productPrices.get(entry.getKey()), entry.getKey());
        }
        System.out.println("Cart Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getValue() + " - Price: " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);

        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 5);
        cart.addToCart("Orange", 3);

        cart.displayCart();
        cart.displaySortedByPrice();
    }
}
