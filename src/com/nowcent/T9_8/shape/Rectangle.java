package com.nowcent.T9_8.shape;

import com.nowcent.T9_8.point.Point;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 11:01
 */
public class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
        double c1 = Math.max(Math.max(p1.getDistanceFrom(p2), p1.getDistanceFrom(p3)), p1.getDistanceFrom(p4));
        double c2 = Math.max(Math.max(p2.getDistanceFrom(p1), p2.getDistanceFrom(p3)), p2.getDistanceFrom(p4));
        if(c1 != c2){
            throw new RuntimeException("这不是长方形哦");
        }
    }
}
