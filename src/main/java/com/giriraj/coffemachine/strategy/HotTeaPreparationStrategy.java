package com.giriraj.coffemachine.strategy;

import com.giriraj.coffemachine.model.BeverageType;
import com.giriraj.coffemachine.model.CoffeMachine;
import com.giriraj.coffemachine.model.HotTea;
import com.giriraj.coffemachine.model.TotalItemsQuantity;

public class HotTeaPreparationStrategy implements BeveragePrepareStrategy{
    @Override
    public String prepareBeverage( CoffeMachine coffeMachine) {
        HotTea hotTea  =coffeMachine.getMachine().getBeverages().getHotTea();
        TotalItemsQuantity totalItemsQuantity = coffeMachine.getMachine().getTotalItemsQuantity();
        if(hotTea.getHotWater() > totalItemsQuantity.getHotWater()) {
            return "Hot tea can not be prepared because Hot Water is not sufficient";
        }
        if(hotTea.getHotMilk() > totalItemsQuantity.getHotMilk()) {
            return "Hot tea can not be prepared because Hot Milk is not sufficient";
        }
        if(hotTea.getGingerSyrup() > totalItemsQuantity.getGingerSyrup()) {
            return "Hot tea can not be prepared because Ginger Syrup is not sufficient";
        }
        if(hotTea.getSugarSyrup() > totalItemsQuantity.getSugarSyrup()) {
            return "Hot tea can not be prepared because Sugar Syrup is not sufficient";
        }
        if(hotTea.getTeaLeavesSyrup() > totalItemsQuantity.getTeaLeavesSyrup()) {
            return "Hot tea can not be prepared because Tea Leaves Syrup is not sufficient";
        }
        totalItemsQuantity.setHotWater(totalItemsQuantity.getHotWater() - hotTea.getHotWater());
        totalItemsQuantity.setHotMilk(totalItemsQuantity.getHotMilk() - hotTea.getHotMilk());
        totalItemsQuantity.setGingerSyrup(totalItemsQuantity.getGingerSyrup() - hotTea.getGingerSyrup());
        totalItemsQuantity.setSugarSyrup(totalItemsQuantity.getSugarSyrup() - hotTea.getSugarSyrup());
        totalItemsQuantity.setTeaLeavesSyrup(totalItemsQuantity.getTeaLeavesSyrup() - hotTea.getTeaLeavesSyrup());
        return "Hot tea is prepared";
    }
}
