package com.javaguru.lesson5;

public class Book {

    String author;
    int pageCount;
    String title;

//    public Book() {
//
//    }

    public Book(String author) {
        setAuthor(author);
    }
    public Book(String author, int pageCount, String title) {
        this.author = author;
        this.pageCount = pageCount;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Author: " + author + "\n"
                + "Title: " + title + "\n"
                + "Pages: " + pageCount;
    }

}
