package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuMenu {
    private static SudokuGame game = new SudokuGame();

    public static SudokuGame getGame() {
        return game;
    }

    public static void setGame(SudokuGame game) {
        SudokuMenu.game = game;
    }

    public static void showOptions() {
        System.out.println("1. Set Element\n" +
                "2. Remove Element\n" +
                "3. Resolve Sudoku\n" +
                "N. New Sudoku\n" +
                "X. Close game ");
        game.getBoard().showBoard();
    }

    public static void chooseOption() {
        String choose;
        Scanner in = new Scanner(System.in);
        choose = in.nextLine().toLowerCase();

        switch(choose) {
            case "1":
                int x = SudokuValidator.validatorCoordinateOrValue("x",SudokuValidator.COORDINATE);
                int y = SudokuValidator.validatorCoordinateOrValue("y", SudokuValidator.COORDINATE);
                int v = SudokuValidator.validatorCoordinateOrValue("v", SudokuValidator.VALUE);
                SudokuMenu.getGame().getBoard().getColumn().setElement(x,y,v);
                SudokuMenu.getGame().getBoard().showBoard();
                break;
            case "2":
                x = SudokuValidator.validatorCoordinateOrValue("x", SudokuValidator.COORDINATE);
                y = SudokuValidator.validatorCoordinateOrValue("y", SudokuValidator.COORDINATE);
                SudokuMenu.getGame().getBoard().getColumn().setElement(x,y,SudokuElement.EMPTY);
                break;
            case "3":
                SudokuMenu.getGame().setResultSudoku(getGame().resolveSudoku());
                if(SudokuMenu.getGame().isResultSudoku()) {
                    SudokuMenu.getGame().getBoard().showBoard();
                }
                break;
            case "n":
                SudokuValidator.newGame("Start new Sudoku?(Y/N)");
                break;
            case "x":
                SudokuValidator.exitGame("Close Sudoku?(Y/N)");

            default:
                System.out.println("Incorrect choose");

        }
    }
}
