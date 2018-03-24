package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirecotry bookDirecotry = new BookDirecotry();

        //When
        List<Book> books = bookDirecotry.getTheBookList();

        //Then
        long numberOfBooksPublicationAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();
        Assert.assertEquals(3,numberOfBooksPublicationAfter2007);
    }
}
