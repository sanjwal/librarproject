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

    public static ArrayList<Book>  sampleData(){
        Book book1 = new Book("Harry 1", "2014", "Author 1", "Author", 4);
        Book book2 = new Book("Harry 2", "2014", "Author 1", "Author", 1);
        Book book3 = new Book("Harry 3", "2014", "Author 1", "Author", 2);
        Book book4 = new Book("Harry 4", "2014", "Author 1", "Author", 5);
        Book book5 = new Book("Harry 5", "2014", "Author 1", "Author", 5);

        ArrayList<Book> allBooks = new ArrayList<Book>();
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);

        return allBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }



}
