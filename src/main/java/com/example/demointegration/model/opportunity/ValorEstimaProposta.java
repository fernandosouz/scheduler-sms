package com.example.demointegration.model.opportunity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValorEstimaProposta {

    @JsonProperty("Value")
    private Number Value;

    public ValorEstimaProposta(){};

    public ValorEstimaProposta(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}