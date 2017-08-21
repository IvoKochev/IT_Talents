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
public class Robot implements IRobot {

    private String name;

    public Robot(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    @Override
    public void makeMove(String[][] matrix, int[] coordinats, String newSim) {
        matrix[coordinats[0]][coordinats[1]] = newSim;
    }
}
