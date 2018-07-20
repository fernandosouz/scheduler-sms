package com.example.demointegration.model.account;

import com.example.demointegration.model.opportunity.TipoServico;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TipoPessoa {

    @JsonProperty("Value")
    private Number Value;

    public TipoPessoa(){};

    public TipoPessoa(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
