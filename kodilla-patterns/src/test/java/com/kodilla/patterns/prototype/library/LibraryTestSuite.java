package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Little Prince", "Exupery", LocalDate.of(2015, 04, 05));
        Book book2 = new Book("Alice in Wonderland", " Lewis Carroll", LocalDate.of(2013, 05, 9));
        Book book3 = new Book("Amelia Bedelia", "Herman Parish", LocalDate.of(2012, 05, 15));

        Library library = new Library("Flower Mound Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making shallow copy
        Library library2 = null;
        try {
            library2 = library.shallowCopy();
            library2.setName("Roanoke Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making deep copy
        Library library3 = null;
        try {
            library3 = library.deepCopy();
            library3.setName("Argyle Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);
        //Then
        library.getBooks().stream()
                .forEach(System.out::println);

        library2.getBooks().stream()
                .forEach(System.out::println);

        library3.getBooks().stream()
                .forEach(System.out::println);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, library2.getBooks().size());
        Assert.assertEquals(3, library3.getBooks().size());


    }
}
