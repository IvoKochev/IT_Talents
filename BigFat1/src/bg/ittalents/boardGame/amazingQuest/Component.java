/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.ittalents.boardGame.amazingQuest;

import java.awt.Image;

/**
 *
 * @author slavi
 */
public abstract class Component {

    private int x;
    private int y;
    private Image image;
    private final int SPACE = 30;

    public Component(int x, int y) {
        setX(x);
        setY(y);
    }

    int getX() {
        return x;
    }

    final void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    final void setY(int y) {
        this.y = y;
    }

    Image getImage() {
        return image;
    }

    final void setImage(Image image) {
        this.image = image;
    }

    boolean isLeftCollision(Component component) {
        return ((this.getX() - SPACE) == component.getX()) && (this.getY() == component.getY());
    }

    boolean isRightCollision(Component component) {
        return ((this.getX() + SPACE) == component.getX()) && (this.getY() == component.getY());
    }

    boolean isTopCollision(Component component) {
        return ((this.getY() - SPACE) == component.getY()) && (this.getX() == component.getX());
    }

    boolean isBottomCollision(Component component) {
        return ((this.getY() + SPACE) == component.getY()) && (this.getX() == component.getX());
    }
}
