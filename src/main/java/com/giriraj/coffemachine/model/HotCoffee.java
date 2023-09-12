package com.giriraj.coffemachine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotCoffee {
    @JsonProperty("hot_water")
    private int hotWater;
    @JsonProperty("ginger_syrup")
    private int gingerSyrup;
    @JsonProperty("hot_milk")
    private int hotMilk;
    @JsonProperty("sugar_syrup")
    private int sugarSyrup;
    @JsonProperty("tea_leaves_syrup")
    private int teaLeavesSyrup;
}
