package com.kodilla.sudoku;

public class SudokuBoard {
    private SudokuColumn column = new SudokuColumn();
    public void showBoard() {
        System.out.println(column);
    }

    public SudokuColumn getColumn() {
        return column;
    }
}
