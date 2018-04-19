package com.kodilla.patterns.singleton.com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks()
                        .add(new Book("Title number " + n, "Author number " + n, LocalDate.now().minusDays(n))) );
        Book book = new Book("Title number 11", "Author number", LocalDate.now());
        library.getBooks().add(book);
        //When
        Library copyLibrary = null;
        try {
            copyLibrary = library.shallowCopy();
            copyLibrary.setName("Library 2");
        } catch (Exception e) {
            System.out.println(e);
        }

        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Library 3");
        } catch (Exception e) {
            System.out.println(e);
        }

        copyLibrary.getBooks().remove(book);

        //Then
        System.out.println(library);
        System.out.println(copyLibrary);
        System.out.println(deepCopyLibrary);
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, copyLibrary.getBooks().size());
        Assert.assertEquals(11, deepCopyLibrary.getBooks().size());
    }
}
