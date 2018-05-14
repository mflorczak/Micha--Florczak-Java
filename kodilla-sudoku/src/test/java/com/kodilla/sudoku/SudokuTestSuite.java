package com.kodilla.sudoku;

import org.junit.Test;

import java.util.ArrayDeque;
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
        //SUDOKU HARD
        game.getBoard().getColumn().setElement(1,0,6);
        game.getBoard().getColumn().setElement(5,0,2);
        game.getBoard().getColumn().setElement(6,0,8);
        game.getBoard().getColumn().setElement(7,0,9);

        game.getBoard().getColumn().setElement(1,1,4);
        game.getBoard().getColumn().setElement(3,1,6);
        game.getBoard().getColumn().setElement(7,1,1);
        game.getBoard().getColumn().setElement(8,1,5);

        game.getBoard().getColumn().setElement(4,2,1);
        game.getBoard().getColumn().setElement(6,2,2);

        game.getBoard().getColumn().setElement(2,3,8);
        game.getBoard().getColumn().setElement(5,3,6);

        game.getBoard().getColumn().setElement(3,4,4);
        game.getBoard().getColumn().setElement(5,4,7);

        game.getBoard().getColumn().setElement(3,5,9);
        game.getBoard().getColumn().setElement(6,5,6);

        game.getBoard().getColumn().setElement(2,6,9);
        game.getBoard().getColumn().setElement(4,6,4);

        game.getBoard().getColumn().setElement(0,7,8);
        game.getBoard().getColumn().setElement(1,7,2);
        game.getBoard().getColumn().setElement(5,7,1);
        game.getBoard().getColumn().setElement(7,7,5);

        game.getBoard().getColumn().setElement(1,8,1);
        game.getBoard().getColumn().setElement(2,8,7);
        game.getBoard().getColumn().setElement(3,8,8);
        game.getBoard().getColumn().setElement(7,8,4);

       //SUDOKU EASY
//        game.getBoard().getColumn().setElement(1,0,4);
//        game.getBoard().getColumn().setElement(2,0,5);
//
//        game.getBoard().getColumn().setElement(0,1,8);
//        game.getBoard().getColumn().setElement(3,1,4);
//        game.getBoard().getColumn().setElement(6,1,5);
//        game.getBoard().getColumn().setElement(8,1,7);
//
//        game.getBoard().getColumn().setElement(0,2,3);
//        game.getBoard().getColumn().setElement(3,2,2);
//        game.getBoard().getColumn().setElement(4,2,9);
//        game.getBoard().getColumn().setElement(6,2,4);
//        game.getBoard().getColumn().setElement(7,2,1);
//
//        game.getBoard().getColumn().setElement(1,3,2);
//        game.getBoard().getColumn().setElement(2,3,8);
//        game.getBoard().getColumn().setElement(4,3,5);
//        game.getBoard().getColumn().setElement(5,3,4);
//        game.getBoard().getColumn().setElement(7,3,7);
//        game.getBoard().getColumn().setElement(8,3,3);
//
//        game.getBoard().getColumn().setElement(2,4,7);
//        game.getBoard().getColumn().setElement(3,4,9);
//        game.getBoard().getColumn().setElement(6,4,2);
//        game.getBoard().getColumn().setElement(7,4,6);
//        game.getBoard().getColumn().setElement(8,4,1);
//
//        game.getBoard().getColumn().setElement(3,5,1);
//
//        game.getBoard().getColumn().setElement(1,6,3);
//        game.getBoard().getColumn().setElement(2,6,4);
//        game.getBoard().getColumn().setElement(4,6,6);
//        game.getBoard().getColumn().setElement(7,6,8);
//
//        game.getBoard().getColumn().setElement(2,7,9);
//        game.getBoard().getColumn().setElement(3,7,3);
//        game.getBoard().getColumn().setElement(4,7,1);
//        game.getBoard().getColumn().setElement(6,7,7);
//        game.getBoard().getColumn().setElement(8,7,5);
//
//        game.getBoard().getColumn().setElement(1,8,8);
//        game.getBoard().getColumn().setElement(3,8,5);
//        game.getBoard().getColumn().setElement(4,8,4);
//        game.getBoard().getColumn().setElement(7,8,2);
//        game.getBoard().getColumn().setElement(8,8,6);










        for(int k = 0; k < 3; k++) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    game.removePossibles(j, i);
                    game.setLastPossibles(j, i);
                }
            }
        }

        //When & Then
        game.getBoard().showBoard();
    }
}
