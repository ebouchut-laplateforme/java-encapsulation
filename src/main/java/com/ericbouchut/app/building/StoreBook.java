package com.ericbouchut.app.building;

import com.ericbouchut.app.library.Book;

/**
 * StoreBook is a subclass of Book.
 * StoreBook inherits from Book's data (attributes)
 * and behaviors (methods).
 */
public class StoreBook extends Book {

    public StoreBook() {

        // Can access the protected `Book.author` attribute
        // from a subclass in **another** package
        author = "Matz";

        /*
         * Cannot access the private attribute `Book.title`
         * from a subclass in **another** package
         */
        // title = "Foobar";

        /*
         * Cannot access the package-private attribute `Book.price`
         * from a subclass in **another** package.
         */
        // price = 123;
    }
}

