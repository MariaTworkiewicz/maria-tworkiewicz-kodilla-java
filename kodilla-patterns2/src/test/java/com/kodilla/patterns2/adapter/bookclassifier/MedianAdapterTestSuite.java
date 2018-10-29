package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
    //Given
        Set<Book> booksSet = new HashSet<>();
        booksSet.add(new Book("Lucy Maud Montgomery", "Ania z Zielonego Wzgorza", 1990, "1/10"));
        booksSet.add(new Book("Jan Brzechwa", "Bajki", 2018, "1/40"));
        booksSet.add(new Book("Julian Tuwim", "Lokomotywa", 2016, "2/80"));
        booksSet.add(new Book("Maria Konopnicka", "Nasza Szkapa", 2002, "5/15"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(booksSet);
        //Then
        System.out.println(median);
        assertEquals(2016, median);
    }
}

