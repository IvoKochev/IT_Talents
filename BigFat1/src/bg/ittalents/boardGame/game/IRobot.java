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
public interface IRobot {

    void makeMove(String[][] matrix, int[] coordinats,String newSim);

}