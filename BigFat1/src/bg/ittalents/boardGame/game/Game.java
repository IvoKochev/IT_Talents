/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.ittalents.boardGame.game;

import java.util.Scanner;

/**
 *
 * @author slavi
 */
public abstract class Game{

    private String name;
    private Player player1;
    private Player player2;
    private Robot robot;
    private Board board;
    private Level currentLevel;
    private int currentRow;
    private int currentCol;
    protected static Scanner input = new Scanner(System.in);

    protected Game(String gameName, Player player1) {
        this.setName(gameName);
        this.setPlayer1(player1);
    }

    protected Game(String name, Player player1, Player player2) {
        this(name, player1);
        this.setPlayer2(player2);
    }

    protected Game(String name, Player player1, Robot robot) {
        this(name, player1);
        this.setRobot(robot);
    }

    protected abstract void makeGame();

    protected abstract void play();

    protected abstract int[] playerMove();

    protected abstract int[] botMovee();

    protected abstract void setLevel(Level level);

    protected abstract void nextLevel();

    protected abstract void gameOver();

    protected void printMatrix(String[][] matrix) {

        for (String[] board1 : matrix) {
            for (String board11 : board1) {
                System.out.format(board11 + " ");
            }
            System.out.println();
        }
    }

    private void setName(String name) {
        if (name == null || name.equals("")) {
            System.err.println("Invalid game name");
            return;
        }
        this.name = name;
    }

    protected String getGameName() {
        return this.name;
    }

    protected final Level getCurrentLevel() {
        return currentLevel;
    }

    protected final void setCurrentLevel(Level currentLevel) {
        this.currentLevel = currentLevel;
    }

    protected Player getPlayer1() {
        return player1;
    }

    private void setPlayer1(Player player1) {
        if (player1 == null) {
            System.err.println("Invalid Player");
            return;
        }
        this.player1 = player1;
    }

    protected Player getPlayer2() {
        return player2;
    }

    private void setPlayer2(Player player2) {
        if (player2 == null) {
            System.err.println("Invalid Player");
            return;
        }
        this.player2 = player2;
    }

    protected Board getBoard() {
        return board;
    }

    protected void setBoard(Board board) {
        if (board == null) {
            System.err.println("Invalid Board");
            return;
        }
        this.board = board;
    }

    protected int getCurrentRow() {
        return this.currentRow;
    }

    protected void setCurrentRow(int row) {
        if (row < 0 || row > board.getRowLength()) {
            System.err.println("Invalid cordinates (row)");
            return;
        }
        this.currentRow = row;

    }

    protected int getCurrentCol() {
        return this.currentCol;
    }

    protected void setCurrentCol(int col) {
        if (col < 0 || col > board.getColLength()) {
            System.err.println("Invalid cordinates (col)");
            return;
        }
        this.currentCol = col;
    }

    protected Robot getRobot() {
        return robot;
    }

    private void setRobot(Robot robot) {
        if (robot == null) {
            System.err.println("Invalid robot");
            return;
        }
        this.robot = robot;
    }

}
