package com.nowcent.T9_8.shape;

import com.nowcent.T9_8.point.Point;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 11:01
 */
public class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
        double length1 = Math.min(p1.getDistanceFrom(p2), p1.getDistanceFrom(p3));
        double length2 = Math.min(p1.getDistanceFrom(p3), p1.getDistanceFrom(p4));
        if(length1 != length2){
            throw new RuntimeException("这不是正方形哦");
        }
    }

    @Override
    public double getArea() {
        return Math.pow(Math.min(point1.getDistanceFrom(point2), point1.getDistanceFrom(point3)), 2);
    }
}
