package com.javaguru.lesson7.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }

    public void addProduct(Product product) {
        if (products.containsKey(product)) {
            Integer count = products.get(product);
            count++;
            products.put(product, count);
        } else {
            products.put(product, 1);
        }
    }

    public void printProduct() {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            System.out.println("Product: " + product.getName()
                    + "Count: " + entry.getValue());
        }
    }
}
