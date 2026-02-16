package org.example.book;

public class Book {
    // Private attributes
    private String title;
    private String description;
    private String isbn;
    private String writer;
    private double price;

    // Empty constructor
    public Book() {
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getWriter() {
        return writer;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to print book information
    public void printInfo() {
        System.out.println("======================");
        System.out.println("Título: " + title);
        System.out.println("Descripción: " + description);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + writer);
        System.out.println("Precio: $" + price);
        System.out.println("======================\n");
    }
}