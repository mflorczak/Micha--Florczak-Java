package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "";
        for(Book book: books) {
            s += book.toString() + "\n";
        }
        return getName() + "\n" + s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library copyLibrary = (Library)super.clone();
        copyLibrary.books = new HashSet<>();
        for(Book book: books) {
            copyLibrary.books.add(new Book(book));
        }
        return copyLibrary;
    }
}
