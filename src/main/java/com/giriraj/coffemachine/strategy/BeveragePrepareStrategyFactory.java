package com.giriraj.coffemachine.strategy;

public class BeveragePrepareStrategyFactory {
    public static BeveragePrepareStrategy getBeveragePrepareStrategy(String beverageType) {
        switch (beverageType) {
            case "hot_tea":
                return new HotTeaPreparationStrategy();
            case "hot_coffee":
                return new HotCoffeePreparationStrategy();
            case "black_tea":
                return new BlackTeaPreparationStrategy();
            case "green_tea":
                return new GreenTeaPreparationStrategy();
            default:
                return null;
        }
    }
}
