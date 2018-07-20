package com.example.demointegration.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

    @JsonProperty("Value")
    private Number Value;

    public Status(){};

    public Status(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
