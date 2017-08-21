/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.ittalents.boardGame.amazingQuest;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author slavi
 */
public class Player extends Component {

    public Player(int x, int y, String imgPath) {
        super(x, y);

        ImageIcon ii = new ImageIcon(this.getClass().getClassLoader().getResource(imgPath));
        Image image = ii.getImage();
        this.setImage(image);
    }

    void move(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

}