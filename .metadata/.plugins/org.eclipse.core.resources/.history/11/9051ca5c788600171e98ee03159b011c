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
public class Player implements IPlayer {

    private final String name;
    private int score;

    Player(String name) {
        this.name = name;
    }

    public Player(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setScore(int score) {
        if (score < 0) {
            System.err.println("Invalid score");
            return;
        }
        this.score = score;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getRow() {
        System.out.print("Enter row " + "\u2193" + " = ");
        while (!Game.input.hasNextInt()) {
            System.err.print("Enter row " + "\u2193" + " = ");
            Game.input.next();
        }
        return Game.input.nextInt();
    }

    @Override
    public int getCol() {
        System.out.print("Enter col " + "\u2192" + " = ");
        while (!Game.input.hasNextInt()) {
            System.err.print("Enter col " + "\u2192" + " = ");
            Game.input.next();
        }
        return Game.input.nextInt();
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeMove(String[][] matrix, int[] coordinats, String newSim) {
        matrix[coordinats[0]][coordinats[1]] = newSim;
    }
}
