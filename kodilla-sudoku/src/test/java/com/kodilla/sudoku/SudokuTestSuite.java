package com.kodilla.sudoku;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        SudokuGame game = new SudokuGame();
        game.getBoard().getColumn().setElement(0,0,1);
        game.getBoard().getColumn().setElement(1,0,8);
        game.getBoard().getColumn().setElement(2,0,7);
        game.getBoard().getColumn().setElement(3,0,6);
        game.getBoard().getColumn().setElement(4,0,5);
        game.getBoard().getColumn().setElement(5,0,4);
        game.getBoard().getColumn().setElement(6,0,3);
        game.getBoard().getColumn().setElement(7,0,9);

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                game.removePossibles(j, i);
            }
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                game.setLastPossibles(j, i);
            }
        }




        //When & Then
        game.getBoard().showBoard();
    }
}
