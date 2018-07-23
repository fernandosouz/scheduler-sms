package com.example.demointegration.model.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptionSetValue {

    @JsonProperty("Value")
    private Number Value;

    public OptionSetValue(){};

    public OptionSetValue(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
