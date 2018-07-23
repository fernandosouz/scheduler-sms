package com.example.demointegration.model.unity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MargemBruta {

    @JsonProperty("Value")
    private Number Value;

    public MargemBruta(){};

    public MargemBruta(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
