package com.ericbouchut.app.library;

public class Librarian {
    public Librarian() {
        Book book = new Book();

        // The protected attribute Book.author
        // can be accessed/modified from the **same** package
        book.author = "Cindy";

        /*
         * Can access the protected attribute `Book.author`
         * from a class (that does not inherit from Book)
         * in the **same** package.
         */
        book.author = "Guido";

        /*
         * Cannot access the private attribute `Book.title`
         * from a class in the **same** package
         */
        // book.title = "Internet Programming with Python";

        /*
         * Can access the package-private attribute `Book.price`
         * from a class in the **same** package.
         */
        book.price = 123;
    }
}
