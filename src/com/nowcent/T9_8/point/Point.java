package com.nowcent.T9_8.point;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 11:03
 */
public class Point {
    private int positionX;
    private int positionY;

    public Point(){
    }

    public Point(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public double getDistanceFrom(Point p){
        return (Math.sqrt(Math.pow(p.getPositionX() - positionX, 2) + Math.pow(p.getPositionY() - positionY, 2)));
    }
}
