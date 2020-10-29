package com.nowcent.T9_8.shape;

import com.nowcent.T9_8.point.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 11:00
 */
public abstract class Quadrilateral {
    protected Point point1;
    protected Point point2;
    protected Point point3;
    protected Point point4;

    public double getArea(){

        List<Point> positionXSortedArray = new ArrayList<>(Arrays.asList(point1, point2, point3, point4));
        positionXSortedArray.sort(Comparator.comparingInt(Point::getPositionX));

        double[] gradients = new double[3];
        for (int i = 0; i < gradients.length; i++) {
            gradients[i] = (positionXSortedArray.get(i + 1).getPositionY() - positionXSortedArray.get(i).getPositionY()) / (float)(positionXSortedArray.get(i + 1).getPositionX() - positionXSortedArray.get(i).getPositionX());
        }

        if((gradients[0] < gradients[1] && gradients[2] < gradients[1]) || (gradients[0] > gradients[1] && gradients[2] > gradients[1])){
            return getOrderedSideArea(positionXSortedArray);
        }

        if(gradients[0] == gradients[1] && gradients[2] == gradients[1]){
            throw  new RuntimeException("不是四边形");
        }

        return getRandomSideArea(positionXSortedArray);









    }

    private double getOrderedSideArea(List<Point> points){
        return getTriangleArea(points.get(0), points.get(2), points.get(3)) + getTriangleArea(points.get(0), points.get(2), points.get(1));

    }

    private double getRandomSideArea(List<Point> points){
        return getTriangleArea(points.get(1), points.get(2), points.get(3)) + getTriangleArea(points.get(1), points.get(2), points.get(0));

    }

    private double getTriangleArea(Point p1, Point p2, Point p3){
        double a = p1.getDistanceFrom(p2);
        double b = p2.getDistanceFrom(p3);
        double c = p3.getDistanceFrom(p1);

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4){
        point1 = p1;
        point2 = p2;
        point3 = p3;
        point4 = p4;
    }


}
