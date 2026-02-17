package org.example.book;

public class Main {
 static void main() {

  Book book1 = new Book("Cien años de soledad", "Obra maestra del realismo mágico", "978-0307474728", "Gabriel García Márquez", 15.99);
  Book book2 = new Book("Don Quijote de la Mancha", "Las aventuras de un hidalgo soñador", "978-8491050681", "Miguel de Cervantes", 12.50);
  Book book3 = new Book("1984", "Distopía sobre un régimen totalitario", "978-0451524935", "George Orwell", 14.99);
  Book book4 = new Book("El Principito", "Fábula poética sobre la amistad y el amor", "978-0156012195", "Antoine de Saint-Exupéry", 10.99);
  Book book5 = new Book("Harry Potter y la Piedra Filosofal", "El inicio de las aventuras del joven mago", "978-8498383447", "J.K. Rowling", 18.99);


  System.out.println(book1.getTitle() + " - " + book1.getWriter() + " - $" + book1.getPrice());
  System.out.println(book2.getTitle() + " - " + book2.getWriter() + " - $" + book2.getPrice());
  System.out.println(book3.getTitle() + " - " + book3.getWriter() + " - $" + book3.getPrice());
  System.out.println(book4.getTitle() + " - " + book4.getWriter() + " - $" + book4.getPrice());
  System.out.println(book5.getTitle() + " - " + book5.getWriter() + " - $" + book5.getPrice());

  System.out.println();
  book3.setTitle("Rebelión en la granja");
  book3.setDescription("Sátira sobre la corrupción del poder");
  book3.setIsbn("978-0451526342");
  book3.setWriter("George Orwell");
  book3.setPrice(11.99);


  System.out.println(book3.getTitle() + " - " + book3.getWriter() + " - $" + book3.getPrice() + book3.getDescription() + book3.getIsbn());
  book3.printInfo();
 }
}