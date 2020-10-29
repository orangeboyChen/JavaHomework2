package com.nowcent.T10_13.impl;

import com.nowcent.T10_13.CarbonFootprint;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 12:19
 */
public class Bicycle implements CarbonFootprint {
    @Override
    public int getCarbonFootprint() {
        System.out.println(getClass());
        return 0;
    }

    public void ride(){
        System.out.println("ride");
    }
}
