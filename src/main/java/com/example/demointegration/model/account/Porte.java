package com.example.demointegration.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Porte {

    @JsonProperty("Value")
    private Number Value;

    public Porte(){};

    public Porte(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
