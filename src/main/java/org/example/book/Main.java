
package org.example.book;

public class Main {
 public static void main(String[] args) {


  Book book1 = new Book();
  book1.setTitle("Cien años de soledad");
  book1.setDescription("Obra maestra del realismo mágico");
  book1.setIsbn("978-0307474728");
  book1.setWriter("Gabriel García Márquez");
  book1.setPrice(15.99);


  Book book2 = new Book();
  book2.setTitle("Don Quijote de la Mancha");
  book2.setDescription("Las aventuras de un hidalgo soñador");
  book2.setIsbn("978-8491050681");
  book2.setWriter("Miguel de Cervantes");
  book2.setPrice(12.50);


  Book book3 = new Book();
  book3.setTitle("1984");
  book3.setDescription("Distopía sobre un régimen totalitario");
  book3.setIsbn("978-0451524935");
  book3.setWriter("George Orwell");
  book3.setPrice(14.99);


  Book book4 = new Book();
  book4.setTitle("El Principito");
  book4.setDescription("Fábula poética sobre la amistad y el amor");
  book4.setIsbn("978-0156012195");
  book4.setWriter("Antoine de Saint-Exupéry");
  book4.setPrice(10.99);


  Book book5 = new Book();
  book5.setTitle("Harry Potter y la Piedra Filosofal");
  book5.setDescription("El inicio de las aventuras del joven mago");
  book5.setIsbn("978-8498383447");
  book5.setWriter("J.K. Rowling");
  book5.setPrice(18.99);



  System.out.println("\n*** LISTADO DE LOS 5 LIBROS ***\n");
  book1.printInfo();
  book2.printInfo();
  book3.printInfo();
  book4.printInfo();
  book5.printInfo();



  System.out.println("\n*** MODIFICANDO EL LIBRO 3 ***\n");
  book3.setTitle("Rebelión en la granja");
  book3.setDescription("Sátira sobre la corrupción del poder");
  book3.setIsbn("978-0451526342");
  book3.setWriter("George Orwell");
  book3.setPrice(11.99);



  System.out.println("\n*** LIBRO 3 DESPUÉS DE MODIFICARLO ***\n");
  book3.printInfo();
 }
}