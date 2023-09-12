package com.giriraj.coffemachine.strategy;

import com.giriraj.coffemachine.model.BlackTea;
import com.giriraj.coffemachine.model.CoffeMachine;
import com.giriraj.coffemachine.model.TotalItemsQuantity;

public class BlackTeaPreparationStrategy implements BeveragePrepareStrategy {
    @Override
    public String prepareBeverage(CoffeMachine coffeMachine) {
        TotalItemsQuantity totalItemsQuantity = coffeMachine.getMachine().getTotalItemsQuantity();
        BlackTea blackTea = coffeMachine.getMachine().getBeverages().getBlackTea();
        if(blackTea.getHotWater() > totalItemsQuantity.getHotWater()) {
            return "Black tea can not be prepared because Hot Water is not sufficient";
        }
        if(blackTea.getGingerSyrup() > totalItemsQuantity.getGingerSyrup()) {
            return "Black tea can not be prepared because Ginger Syrup is not sufficient";
        }
        if(blackTea.getSugarSyrup() > totalItemsQuantity.getSugarSyrup()) {
            return "Black tea can not be prepared because Sugar Syrup is not sufficient";
        }
        if(blackTea.getTeaLeavesSyrup() > totalItemsQuantity.getTeaLeavesSyrup()) {
            return "Black tea can not be prepared because Tea Leaves Syrup is not sufficient";
        }
        totalItemsQuantity.setHotWater(totalItemsQuantity.getHotWater() - blackTea.getHotWater());
        totalItemsQuantity.setGingerSyrup(totalItemsQuantity.getGingerSyrup() - blackTea.getGingerSyrup());
        totalItemsQuantity.setSugarSyrup(totalItemsQuantity.getSugarSyrup() - blackTea.getSugarSyrup());
        totalItemsQuantity.setTeaLeavesSyrup(totalItemsQuantity.getTeaLeavesSyrup() - blackTea.getTeaLeavesSyrup());
        return "Black tea is prepared";
    }
}
