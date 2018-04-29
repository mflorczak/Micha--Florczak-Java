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
            String v = row.intValue() == -1 ? "__" : " " + row.intValue();
            if(counter % 3 == 0) {
                if(counter > 0) {
                    s += "|";
                }
                s += " |" + v;
            } else {
                s += "|" + v;
            }
            counter++;
        }
        return s + "|\n";
    }
}
