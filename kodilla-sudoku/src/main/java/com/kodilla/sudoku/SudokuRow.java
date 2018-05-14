package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuRow {
    private List<SudokuElement> rows = new ArrayList<>();

    public SudokuRow() {
        for(int i = 0; i < 9; i++) {
            rows.add(new SudokuElement());
            rows.get(i).setValue(EMPTY);
        }
    }

    public List<SudokuElement> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        String s = "";
        int counter = 0;
        for(SudokuElement row: rows) {
            String v = row.getValue() == -1 ? "__" : " " + row.getValue();
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
