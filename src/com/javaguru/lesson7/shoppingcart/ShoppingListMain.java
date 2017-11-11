package com.javaguru.lesson7.shoppingcart;

public class ShoppingListMain {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product firstProduct = new Product("Rasa", ProductType.MILK);
        Product secondProduct = new Product("Apple", ProductType.FRUIT);
        Product thirdProduct = new Product("Cucumber", ProductType.VEGETABLE);

        shoppingCart.addProduct(firstProduct);
        shoppingCart.addProduct(firstProduct);
        shoppingCart.addProduct(firstProduct);

        shoppingCart.addProduct(secondProduct);
        shoppingCart.addProduct(secondProduct);

        shoppingCart.addProduct(thirdProduct);
        shoppingCart.addProduct(thirdProduct);
        shoppingCart.addProduct(thirdProduct);

        shoppingCart.printProduct();

    }
}
