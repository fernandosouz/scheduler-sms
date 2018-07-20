package com.example.demointegration.model.opportunity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RazaoStatus {

    @JsonProperty("Value")
    private Number Value;

    public RazaoStatus(){};

    public RazaoStatus(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
