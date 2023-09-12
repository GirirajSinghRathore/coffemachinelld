package com.giriraj.coffemachine.strategy;

import com.giriraj.coffemachine.model.CoffeMachine;
import com.giriraj.coffemachine.model.GreenTea;
import com.giriraj.coffemachine.model.TotalItemsQuantity;

public class GreenTeaPreparationStrategy implements BeveragePrepareStrategy {
    @Override
    public String prepareBeverage(CoffeMachine coffeMachine) {
        GreenTea greenTea = coffeMachine.getMachine().getBeverages().getGreenTea();
        TotalItemsQuantity totalItemsQuantity = coffeMachine.getMachine().getTotalItemsQuantity();
        if(greenTea.getHotWater() > totalItemsQuantity.getHotWater()) {
            return "Green tea can not be prepared because Hot Water is not sufficient";
        }
        if(greenTea.getGingerSyrup() > totalItemsQuantity.getGingerSyrup()) {
            return "Green tea can not be prepared because Ginger Syrup is not sufficient";
        }
        if(greenTea.getSugarSyrup() > totalItemsQuantity.getSugarSyrup()) {
            return "Green tea can not be prepared because Sugar Syrup is not sufficient";
        }
        if(greenTea.getGreenMixture() > totalItemsQuantity.getGreenMixture()) {
            return "Green tea can not be prepared because Green Mixture is not sufficient";
        }
        totalItemsQuantity.setHotWater(totalItemsQuantity.getHotWater() - greenTea.getHotWater());
        totalItemsQuantity.setGingerSyrup(totalItemsQuantity.getGingerSyrup() - greenTea.getGingerSyrup());
        totalItemsQuantity.setSugarSyrup(totalItemsQuantity.getSugarSyrup() - greenTea.getSugarSyrup());
        totalItemsQuantity.setGreenMixture(totalItemsQuantity.getGreenMixture() - greenTea.getGreenMixture());
        return "Green tea is prepared";
    }
}
