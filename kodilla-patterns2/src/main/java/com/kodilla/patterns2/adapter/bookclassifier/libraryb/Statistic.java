package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistic implements BookStatistic {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        if(books.size() == 0) return 0;
        return books.entrySet().stream().
                mapToInt(e -> e.getValue().getPublicationYear())
                .sum() / books.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        if(books.size() == 0) return 0;
        int[] years = new int[books.size()];
        int n = 0;
        for(Map.Entry<BookSignature, Book> book: books.entrySet()) {
            years[n] = book.getValue().getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        if(years.length % 2 == 0) {
            return years[(int)(years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}
