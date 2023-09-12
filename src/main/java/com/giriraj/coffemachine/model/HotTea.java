package com.giriraj.coffemachine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotTea {
    @JsonProperty("hot_water")
    public int hotWater;
    @JsonProperty("hot_milk")
    public int hotMilk;
    @JsonProperty("ginger_syrup")
    public int gingerSyrup;
    @JsonProperty("sugar_syrup")
    public int sugarSyrup;
    @JsonProperty("tea_leaves_syrup")
    public int teaLeavesSyrup;
}
