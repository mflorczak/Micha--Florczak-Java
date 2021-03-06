package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuColumn {
    private List<SudokuRow> cols = new ArrayList<>();

    public SudokuColumn() {
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> cols.add(new SudokuRow()));
    }

    public List<SudokuRow> getCols() {
        return cols;
    }

    public void setElement(int x, int y, int value) {
        cols.get(y).getRows().get(x).setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        int counter = 0;
        System.out.print("y\\x 0  1  2    3  4  5    6  7  8");
        for(SudokuRow col: cols) {
            if(counter % 3 == 0) {
                s += "\n";
            }
            counter++;
            s += counter -1 + col.toString();
        }
        return s;
    }
}
