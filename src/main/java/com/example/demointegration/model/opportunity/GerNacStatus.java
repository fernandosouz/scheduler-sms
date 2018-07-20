package com.example.demointegration.model.opportunity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GerNacStatus {

    @JsonProperty("Value")
    private Number Value;

    public GerNacStatus(){};

    public GerNacStatus(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
