package com.example.demointegration.model.unity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TipoEndereco {

    @JsonProperty("Value")
    private Number Value;

    public TipoEndereco(){}

    public TipoEndereco(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
