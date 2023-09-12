package com.giriraj.coffemachine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlackTea {
    @JsonProperty("hot_water")
    public int hotWater;
    @JsonProperty("ginger_syrup")
    public int gingerSyrup;
    @JsonProperty("sugar_syrup")
    public int sugarSyrup;
    @JsonProperty("tea_leaves_syrup")
    public int teaLeavesSyrup;
}
