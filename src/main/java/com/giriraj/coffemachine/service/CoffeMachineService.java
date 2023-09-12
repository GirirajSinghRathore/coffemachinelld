package com.giriraj.coffemachine.service;

import com.giriraj.coffemachine.model.CoffeMachine;
import com.giriraj.coffemachine.strategy.BeveragePrepareStrategy;
import com.giriraj.coffemachine.strategy.BeveragePrepareStrategyFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CoffeMachineService {
    public List<String> prepareBeverage(CoffeMachine coffeMachine) {
        List<String> response = new ArrayList<>();


        // using factory pattern
        BeveragePrepareStrategy hotTeaBeveragePrepareStrategy = BeveragePrepareStrategyFactory.getBeveragePrepareStrategy("hot_tea");
        response.add(hotTeaBeveragePrepareStrategy.prepareBeverage(coffeMachine));
        BeveragePrepareStrategy hotCoffeeBeveragePrepareStrategy = BeveragePrepareStrategyFactory.getBeveragePrepareStrategy("hot_coffee");
        response.add(hotCoffeeBeveragePrepareStrategy.prepareBeverage(coffeMachine));
        BeveragePrepareStrategy greenTeaBeveragePrepareStrategy = BeveragePrepareStrategyFactory.getBeveragePrepareStrategy("green_tea");
        response.add(greenTeaBeveragePrepareStrategy.prepareBeverage(coffeMachine));
        BeveragePrepareStrategy blackTeaBeveragePrepareStrategy = BeveragePrepareStrategyFactory.getBeveragePrepareStrategy("black_tea");
        response.add(blackTeaBeveragePrepareStrategy.prepareBeverage(coffeMachine));



        return response;



    }
}
