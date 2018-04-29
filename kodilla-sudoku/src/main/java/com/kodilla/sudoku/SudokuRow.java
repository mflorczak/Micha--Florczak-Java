package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuRow {
    private List<Integer> rows = new ArrayList<>();

    public SudokuRow() {
        SudokuElement element = new SudokuElement(SudokuElement.EMPTY);
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> rows.add(element.getValue()));
    }

    public List<Integer> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        String s = "";
        int counter = 0;
        for(Integer row: rows) {
            if(row.intValue() == -1 ) {
                if(counter % 3 == 0) {
                    s += " |__|";
                } else {
                    s += "|__|";
                }
                counter++;
            } else {
                s += "|" + " " + row.intValue() + "|";
            }
        }
        return s + "\n";
    }
}
