package org.day1;

import java.util.*;

//Using enum for different product category
enum BookCategory {
    FICTION, NON_FICTION, SCIENCE, HISTORY;
}
enum ClothingCategory {
    MEN, WOMEN, KIDS
}
enum GadgetCategory {
    MOBILE, LAPTOP, ACCESSORY
}

class Product <T> {
    // Attributes
    private String productName;
    private double productPrice;
    private T category;

    // Constructor
    Product(String productName, double productPrice, T category) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Product Category: " + category);
    }

    // Getter and setters

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}

//Generic method to apply discount to a product
class DiscountManager {
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        double discount = (percentage * product.getProductPrice()) / 100;
        product.setProductPrice(product.getProductPrice() - discount);
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("The Alchemist", 500, BookCategory.FICTION);
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 1200, ClothingCategory.MEN);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 30000, GadgetCategory.MOBILE);

        System.out.println("Before Discount:");
        book.displayDetails();
        shirt.displayDetails();
        phone.displayDetails();

        // Applying discounts
        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 20);
        DiscountManager.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        book.displayDetails();
        shirt.displayDetails();
        phone.displayDetails();
    }
}
