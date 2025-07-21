package com.ericbouchut.app.library;

// Book is package-protected, hence not usable in another package
public class Book {

    // ~~~~~ Attibutes
    public String isbn;
    protected String author;
    private String title;
    int price;


    // ~~~~~ Methods
    public void modifyBook(){

        isbn = "24";
        author = "James";

        /*
         * Can access the private field `Book.title`
         * from within the class any method
         */
        title = "Java";

        /*
         * Can access the package-private attribute `Book.price`
         * from within the same class.
         */
        price = 123;

        System.out.println("modified Book");
    }

    public void printBook() {
        System.out.println("Book{isbn: " + isbn + ", author: " + author +"}");
    }
}
