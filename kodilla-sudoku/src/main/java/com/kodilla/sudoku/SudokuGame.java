package com.kodilla.sudoku;

public class SudokuGame {
    private SudokuBoard board = new SudokuBoard();

    public boolean resolveSudoku() {
        return true;
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public void validatorSudoku() {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++ ) {
                if (board.getColumn().getCols().get(i).getRows().get(j)
                        == board.getColumn().getRow().getElement().getValue()) {
                    board.getColumn().getRow().getElement().getPossibleValues()
                            .remove(board.getColumn().getRow().getElement());
              } else if(board.getColumn().getCols().get(i).getRows().get(j) == -1
                        && board.getColumn().getRow().getElement().getPossibleValues().size() == 1) {
                    board.getColumn().setElement(i,j,board.getColumn().getRow().getElement().getPossibleValues().get(0));
                }
            }
        }
    }
}
