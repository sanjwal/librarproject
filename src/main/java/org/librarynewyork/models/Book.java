package org.librarynewyork.models;

import java.util.ArrayList;

public class Book {

    public String id;
    public String name;
    public String publishDate;
    public String author;
    public int quantity;

    public Book(String id, String name, String publishDate, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
        this.quantity = quantity;
    }
}







