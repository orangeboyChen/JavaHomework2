package com.nowcent.T9_8.shape;

import com.nowcent.T9_8.point.Point;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 11:01
 */
public class Parallelogram extends Quadrilateral {
    @Override
    public double getArea() {
        int vx1 = point2.getPositionX() - point1.getPositionX();
        int vy1 = point2.getPositionY() - point1.getPositionY();
        int vx2 = point3.getPositionX() - point1.getPositionX();
        int vy2 = point3.getPositionY() - point1.getPositionY();

        return Math.abs(vx1 * vy2 - vx2 * vy1);
    }

    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
        int vx1 = Math.abs(p1.getPositionX() - p2.getPositionX());
        int vy1 = Math.abs(p1.getPositionY() - p2.getPositionY());
        int vx2 = Math.abs(p3.getPositionX() - p4.getPositionX());
        int vy2 = Math.abs(p3.getPositionY() - p4.getPositionY());

        if(vx1 != vx2 || vy1 != vy2){
            throw new RuntimeException("这不是平行四边形哦");
        }

    }
}
