package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("test", "test", 2008,"XYZ1"));
        books.add(new Book("test", "test", 2010,"XYZ1"));
        books.add(new Book("test", "test", 2012,"XYZ1"));

        //When
        MedianAdapter adapter = new MedianAdapter();
        int result = adapter.publicationYearMedian(books);

        //Then
        assertEquals(2010, result);
    }
}
