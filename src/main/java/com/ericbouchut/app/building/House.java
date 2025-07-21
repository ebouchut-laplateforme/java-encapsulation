package com.ericbouchut.app.building;

import com.ericbouchut.app.library.Book;

public class House {
    private Book book;

    public House() {
        book = new Book();

        /* Cannot access the protected `Book.author` attribute
         * in a class from another package,
         * which does not inherit from Book.
         */
        // book.author = "James";

        /*
         * Cannot access the private attribute `Book.title`
         * from a class in another package.
         */
        // book.title = "Java Standard Edition 0.9";

        /*
         * Cannot access the package-private attribute `Book.price`
         * from a subclass in **another** package.
         */
        // book.price;
    }
}
