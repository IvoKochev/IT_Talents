/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.ittalents.boardGame.game;

/**
 *
 * @author slavi
 */
public class Board implements IBoard {

    private String[][] matrix;
    private int rowLength;
    private int colLength;

    public Board(int row, int col) {
        this.makeMatrix(row, col);
    }

    @Override
    public final void makeMatrix(int row, int col) {
        if (row < 0 || col < 0) {
            System.err.println("Board not created! Invalid coordinates");
            return;
        }
        this.matrix = new String[row][col];
        this.setRowLength(row);
        this.setColLength(col);

    }

    @Override
    public String[][] getMatrixx() {
        return matrix;
    }

    public int getRowLength() {
        return rowLength;
    }

    public void setRowLength(int rowLength) {
        this.rowLength = rowLength;
    }

    public int getColLength() {
        return colLength;
    }

    public void setColLength(int colLength) {
        this.colLength = colLength;
    }

}
