package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuMenu.showOptions();
            SudokuMenu.chooseOption();
            gameFinished = SudokuMenu.getGame().isResultSudoku();
        }

    }
}