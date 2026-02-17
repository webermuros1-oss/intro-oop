package org.example.book;

public class Book {

    private String title;
    private String description;
    private String isbn;
    private String writer;
    private double price;


    public Book(String title, String description, String isbn, String writer, double price) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.writer = writer;
        this.price = price;
    }


    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getWriter() {
        return this.writer;
    }

    public double getPrice() {
        return this.price;
    }


    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setIsbn(String newIsbn) {
        this.isbn = newIsbn;
    }

    public void setWriter(String newWriter) {
        this.writer = newWriter;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }


    public void printInfo() {
        System.out.println("Título: " + title);
        System.out.println("Descripción: " + description);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + writer);
        System.out.println("Precio: $" + price);

    }
}