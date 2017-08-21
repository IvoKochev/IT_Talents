/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.ittalents.boardGame.foxAndHounds;

/**
 *
 * @author slavi
 */
public class Hound {

    private final String name;
    private int row;
    private int col;

    Hound(String name, int row, int col) {
        this.name = name;
        this.setRow(row);
        this.setCol(col);
    }

    int getRow() {
        return row;
    }

    final void setRow(int row) {
        this.row = row;
    }

    int getCol() {
        return col;
    }

    final void setCol(int col) {
        this.col = col;
    }
}
