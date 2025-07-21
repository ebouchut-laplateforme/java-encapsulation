package com.ericbouchut.app.library;

public class CourseBook extends Book{

    public CourseBook(){
        Book book = new Book();

        /*
         * Can access the protected attribute `Book.author`
         * from this subclass in the **same** package.
         */
        book.author = "Guido";

        /*
         * Cannot access the private attribute `Book.title`
         * from a subclass in the **same** package
         */
        // book.title = "Internet Programming with Python";

        /*
         * Can access the package-private attribute `Book.price`
         * from a subclass in the **same** package.
         */
        book.price = 123;
    }
}
