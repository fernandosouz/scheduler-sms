package com.example.demointegration.model.unity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FaturamentoBruto {

    @JsonProperty("Value")
    private Number Value;

    public FaturamentoBruto(){};

    public FaturamentoBruto(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
