package com.giriraj.coffemachine.strategy;

import com.giriraj.coffemachine.model.BeverageType;
import com.giriraj.coffemachine.model.CoffeMachine;

public interface BeveragePrepareStrategy {
    String prepareBeverage( CoffeMachine coffeMachine);
}
