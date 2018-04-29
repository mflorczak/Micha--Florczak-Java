package com.kodilla.sudoku;

import org.junit.Test;

public class SudokuTestSuite {
    @Test
    public void testAddNewRow() {
        //Given
        SudokuRow row = new SudokuRow();
        //When & Then
        System.out.println(row);
    }

    @Test
    public void testShowBoard() {
        //Given
        SudokuBoard board = new SudokuBoard();
        board.getColumn().setElement(0,0,9);
        //When & Then
        //column.setElement(0,0, 9);

        board.showBoard();
    }
}
