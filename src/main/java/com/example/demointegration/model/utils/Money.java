package com.example.demointegration.model.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Money {

    @JsonProperty("Value")
    private Number Value;

    public Money(){};

    public Money(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
