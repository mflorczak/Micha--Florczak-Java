package com.kodilla.sudoku;

public class SudokuGame {
    private SudokuBoard board = new SudokuBoard();

    public boolean resolveSudoku() {
        return true;
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public void removePossibles(int x, int y) {
        SudokuElement el = getBoard().getColumn().getCols().get(y).getRows().get(x);
        for(int i = 0; i < 9; i++) {
            if(el.getPossibleValues().contains(getBoard().getColumn().getCols().get(y).getRows().get(i).getValue())) {
                el.getPossibleValues().remove(getBoard().getColumn().getCols().get(y).getRows().get(i).getValue() -1);
            }
        }
        for(int i = 0; i < el.getPossibleValues().size(); i++) {
            System.out.print(" Możliwa wartość: " + el.getPossibleValues().get(i));
        }
        System.out.println();
    }

    public void setLastPossibles(int x, int y) {
        SudokuElement el = getBoard().getColumn().getCols().get(y).getRows().get(x);
        if(el.getPossibleValues().size() == 1 && el.getValue() == -1) {
            el.setValue(el.getPossibleValues().get(0));
        }
    }
}
