package com.nowcent.T10_13.impl;

import com.nowcent.T10_13.CarbonFootprint;

/**
 * @author orangeboyChen
 * @version 1.0
 * @date 2020/10/28 12:18
 */
public class Building implements CarbonFootprint {
    @Override
    public int getCarbonFootprint() {
        System.out.println(getClass());
        return 1;
    }

    public void drinkCoffee(){
        System.out.println("drinkCoffee");
    }

}
