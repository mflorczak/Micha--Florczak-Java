package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        for(int i = 1; i < 10; i++) {
            possibleValues.add(i);
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }
}
