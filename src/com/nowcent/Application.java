package com.nowcent;

import com.nowcent.T10_13.CarbonFootprint;
import com.nowcent.T10_13.impl.Bicycle;
import com.nowcent.T10_13.impl.Building;
import com.nowcent.T10_13.impl.Car;
import com.nowcent.T9_8.point.Point;
import com.nowcent.T9_8.shape.Parallelogram;
import com.nowcent.T9_8.shape.Quadrilateral;
import com.nowcent.T9_8.shape.Rectangle;
import com.nowcent.T9_8.shape.Square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 12:03
 */
public class Application {
    public static void main(String[] args) {
        Quadrilateral square = new Parallelogram(
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 1),
                new Point(2, 0)
        );
        System.out.println(square.getArea());

        List<CarbonFootprint> carbonFootprints = Arrays.asList(new Building(), new Bicycle(), new Car());
        carbonFootprints.forEach(c -> System.out.println(c.getCarbonFootprint()));
    }
}
