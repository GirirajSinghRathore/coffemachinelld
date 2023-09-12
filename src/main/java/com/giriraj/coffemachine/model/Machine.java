package com.giriraj.coffemachine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Machine {
    private Outlets outlets;
    @JsonProperty("total_items_quantity")
    private TotalItemsQuantity totalItemsQuantity;
    private Beverages beverages;

}
