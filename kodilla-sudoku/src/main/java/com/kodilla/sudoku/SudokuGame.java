package com.kodilla.sudoku;

public class SudokuGame {
    private SudokuBoard board = new SudokuBoard();
    private boolean resultSudoku = false;

    public boolean isResultSudoku() {
        return resultSudoku;
    }

    public void setResultSudoku(boolean resultSudoku) {
        this.resultSudoku = resultSudoku;
    }

    public boolean resolveSudoku() {
        int emptyPlace;
        while(true) {
            boolean changed = false;
            emptyPlace = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    removePossibles(j, i);
                    changed = changed || setLastPossibles(j, i);
                    if(getBoard().getColumn().getCols().get(i).getRows().get(j).getValue() == -1) {
                        ++emptyPlace;
                    }
                }
            }
            if(emptyPlace == 0) {
                return true;
            }
            if(!changed) {
                System.out.println("Failure resolve!");
                return false;
            }
        }
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public int getBoxNumber(int x) {
        return x / 3;
    }

    public void removePossibles(int x, int y) {
        SudokuElement el = getBoard().getColumn().getCols().get(y).getRows().get(x);
        for(int i = 0; i < 9; i++) {
            //Row
            if(el.getPossibleValues().contains(getBoard().getColumn().getCols().get(y).getRows().get(i).getValue())) {
                Integer integer = getBoard().getColumn().getCols().get(y).getRows().get(i).getValue();
                el.getPossibleValues().remove(integer);
            }
            //Column
            if(el.getPossibleValues().contains(getBoard().getColumn().getCols().get(i).getRows().get(x).getValue())) {
                Integer integer = getBoard().getColumn().getCols().get(i).getRows().get(x).getValue();
                el.getPossibleValues().remove(integer);
            }
        }

        for(int q = 0; q < 3; q++) {
            for(int m = 0; m < 3; m++) {
                Integer integer = getBoard().getColumn().getCols()
                        .get(q + getBoxNumber(y)*3).getRows().get(m + getBoxNumber(x)*3).getValue();
                el.getPossibleValues().remove(integer);
            }
        }
    }

    public boolean setLastPossibles(int x, int y) {
        boolean result = false;
        SudokuElement el = getBoard().getColumn().getCols().get(y).getRows().get(x);
        if(el.getPossibleValues().size() == 1 && el.getValue() == -1) {
            result = true;
            el.setValue(el.getPossibleValues().get(0));
        }
        return result;
    }
}
