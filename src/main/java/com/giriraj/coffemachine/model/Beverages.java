package com.giriraj.coffemachine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beverages {
    @JsonProperty("hot_tea")
    private HotTea hotTea;
    @JsonProperty("hot_coffee")
    private HotCoffee hotCoffee;
    @JsonProperty("black_tea")
    private BlackTea blackTea;
    @JsonProperty("green_tea")
    private GreenTea greenTea;

}
