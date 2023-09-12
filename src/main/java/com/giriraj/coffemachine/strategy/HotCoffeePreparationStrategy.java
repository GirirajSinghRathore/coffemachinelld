package com.giriraj.coffemachine.strategy;

import com.giriraj.coffemachine.model.BeverageType;
import com.giriraj.coffemachine.model.CoffeMachine;
import com.giriraj.coffemachine.model.HotCoffee;
import com.giriraj.coffemachine.model.TotalItemsQuantity;

public class HotCoffeePreparationStrategy implements BeveragePrepareStrategy {
    @Override
    public String prepareBeverage( CoffeMachine coffeMachine) {

        HotCoffee hotCoffee  =coffeMachine.getMachine().getBeverages().getHotCoffee();
        TotalItemsQuantity totalItemsQuantity = coffeMachine.getMachine().getTotalItemsQuantity();
        if(hotCoffee.getHotWater() > totalItemsQuantity.getHotWater()) {
            return "Hot coffee can not be prepared because Hot Water is not sufficient";
        }
        if(hotCoffee.getHotMilk() > totalItemsQuantity.getHotMilk()) {
            return "Hot coffee can not be prepared because Hot Milk is not sufficient";
        }
        if(hotCoffee.getGingerSyrup() > totalItemsQuantity.getGingerSyrup()) {
            return "Hot coffee can not be prepared because Ginger Syrup is not sufficient";
        }
        if(hotCoffee.getSugarSyrup() > totalItemsQuantity.getSugarSyrup()) {
            return "Hot coffee can not be prepared because Sugar Syrup is not sufficient";
        }
        if(hotCoffee.getTeaLeavesSyrup() > totalItemsQuantity.getTeaLeavesSyrup()) {
            return "Hot coffee can not be prepared because Tea Leaves Syrup is not sufficient";
        }
        totalItemsQuantity.setHotWater(totalItemsQuantity.getHotWater() - hotCoffee.getHotWater());
        totalItemsQuantity.setHotMilk(totalItemsQuantity.getHotMilk() - hotCoffee.getHotMilk());
        totalItemsQuantity.setGingerSyrup(totalItemsQuantity.getGingerSyrup() - hotCoffee.getGingerSyrup());
        totalItemsQuantity.setSugarSyrup(totalItemsQuantity.getSugarSyrup() - hotCoffee.getSugarSyrup());
        totalItemsQuantity.setTeaLeavesSyrup(totalItemsQuantity.getTeaLeavesSyrup() - hotCoffee.getTeaLeavesSyrup());
        return "Hot coffee is prepared";
    }
}
