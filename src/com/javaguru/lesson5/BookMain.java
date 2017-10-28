package com.javaguru.lesson5;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Tolkien", 1000, "...");
//        book.setAuthor("Tolkien");
//        book.setTitle("Lord of the rings");
//        book.setPageCount(1000);

        Book secondBook = new Book("Bob");

        System.out.println(book.toString());
    }
}
